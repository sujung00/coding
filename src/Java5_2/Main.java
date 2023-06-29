package Java5_2;

import java.util.Scanner;
import java.util.Stack;

// 2023.06.29
public class Main {
    public Stack<Character> solution(String str){
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()){
            stack.push(x);
            if (x == ')'){
                while (stack.peek() != '('){
                    stack.pop();
                }
                if (stack.peek() == '(') stack.pop();
            }
        }

        return stack;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for (char x : T.solution(str)){
            System.out.print(x);
        }
    }
}
