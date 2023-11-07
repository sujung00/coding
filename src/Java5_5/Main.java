package Java5_5;

import java.util.*;

// 2023.06.30*
public class Main {
    public int solution(String str){
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '('){
                stack.push(str.charAt(i));
            } else {
                stack.pop();
                if (str.charAt(i-1) == '(') answer += stack.size();
                else answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
