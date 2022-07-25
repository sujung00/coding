package Java9.review;

import java.util.Scanner;

public class Main {
    public int solution(String str){
        String num = "";
        int answer = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57){
                num += str.charAt(i);
            }
        }
        answer = Integer.parseInt(num);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(T.solution(str));

    }
}
