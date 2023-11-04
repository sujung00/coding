package Java5_1;

import java.util.Scanner;
import java.util.Stack;

// 2023.06.28
public class Main {
    public String solution(String str){
        String answer = "YES";

        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()){
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) {
                    answer = "NO";
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) answer = "NO";

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
