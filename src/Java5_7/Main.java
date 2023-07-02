package Java5_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 2023.07.02*
public class Main {
    public String solution(String s1, String s2){
        String answer = "YES";

        Queue<Character> Q = new LinkedList<>();
        for (char x : s1.toCharArray()){
            Q.offer(x);
        }
        for (char x : s2.toCharArray()){
            if (Q.contains(x)){
                if (x != Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) return "NO";

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        System.out.println(T.solution(s1, s2));
    }
}
