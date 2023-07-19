package Java5_4;

import java.util.Scanner;
import java.util.Stack;

// 2023.06.30
public class  Main {
    public int solution(String str){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()){
            if (x == '+'){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
            } else if (x == '-') {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
            } else if (x == '*'){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a*b);
            } else if (x == '/') {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            } else {
                stack.push(x-48);
            }
        }
        answer = stack.pop();

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
