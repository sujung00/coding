package Java5_4;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Stack;

// 2023.06.30
public class  Main {
    public int solution(String str){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()){
            if (x == '+' || x == '-' || x == '*' || x == '/'){
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                switch (x){
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                }
                stack.push(result);
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
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
