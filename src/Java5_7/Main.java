package Java5_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 2023.07.02*
public class Main {
    public String solution(String a, String b){
        String answer = "YES";

        Queue<Character> aqueue = new LinkedList<>();
        Queue<Character> bqueue = new LinkedList<>();
        for (char x : a.toCharArray()){
            aqueue.add(x);
        }
        for (int i = 0; i < b.length(); i++){
            for (char x : aqueue){
                if (x == b.charAt(i)){
                    bqueue.add(x);
                }
            }
        }
        if (!aqueue.equals(bqueue)) return "NO";

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(T.solution(a, b));
    }
}
