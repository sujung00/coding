package Java5_7;

import java.util.*;

// 2023.07.02*

public class Main {
    public String solution(String need, String plan){
        String answer = "YES";

        Queue<Character> Q = new LinkedList<>();
        for (char x : need.toCharArray()){
            Q.add(x);
        }
        for (char x : plan.toCharArray()){
            if (Q.contains(x)){
                if (x != Q.poll()){
                    return "NO";
                }
            }
        }
        if (!Q.isEmpty()) return "NO";

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String p = scanner.next();
        String h = scanner.next();
        System.out.println(T.solution(p, h));
    }
}
