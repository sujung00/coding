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
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b+a);
            } else if (x == '-'){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            } else if (x == '*'){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b*a);
            } else if (x == '/'){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            } else {
                stack.push(Integer.parseInt(String.valueOf(x)));
            }
        }
        answer = stack.peek();

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
