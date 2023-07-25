package Java5_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 2023.07.02*
public class Main {
    public String solution(String need, String plan){
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();
        // queue에 필수과목 넣기
        for (char x : need.toCharArray()){
            queue.add(x);
        }
        for (char x : plan.toCharArray()){
            if (queue.contains(x)){
                // 필수과목 순서가 맞지 않음
                if (x != queue.poll()){
                    return "NO";
                }
            }
        }
        // 필수과목이 아직 남아있다면
        if (!queue.isEmpty()){
            return "NO";
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String need = scanner.next();
        String plan = scanner.next();
        System.out.println(T.solution(need, plan));
    }
}
