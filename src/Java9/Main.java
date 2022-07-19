package Java9;

import java.util.Scanner;

public class Main {
    public int solution(String str){
        int answer = 0;

        String s = "";

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57){
                s += str.charAt(i);
            }
        }

        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(T.solution(str));
    }
}
