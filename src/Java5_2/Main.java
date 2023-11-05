package Java5_2;

import java.util.Scanner;
import java.util.Stack;

// 2023.06.29
public class Main {
    public String solution(String str){
        String answer = "";

        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()){
            if (x == '(' || Character.isAlphabetic(x)) {
                stack.push(x);
            } else {
                while (stack.peek() != '('){
                    stack.pop();
                }
                stack.pop();
            }
        }
        for (char x : stack){
            answer += x;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
