package Java2.review;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 65 && str.charAt(i) <=90){
                answer += Character.toLowerCase(str.charAt(i));
            }else if (str.charAt(i) >= 97 && str.charAt(i) <= 122){
                answer += Character.toUpperCase(str.charAt(i));
            }
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
