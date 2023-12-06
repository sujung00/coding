package Java5_7;

import java.util.*;

// 2023.07.02*

public class Main {
    public String solution(String need, String plan){
        String answer = "NO";

        Queue<Character> needQueue = new LinkedList<>();
        Queue<Character> planQueue = new LinkedList<>();
        for (char x : need.toCharArray()){
            needQueue.add(x);
        }
        for (char x : plan.toCharArray()){
            char tmp = needQueue.peek();
            if (tmp == x) {
                planQueue.add(x);
                needQueue.add(needQueue.poll());
            }
        }
        if (needQueue.equals(planQueue)) return "YES";

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
