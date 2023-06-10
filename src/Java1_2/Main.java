package Java1_2;

import java.util.Scanner;

// 2023.06.10

public class Main {

    public String solution(String str){
        String answer = "";

        for (int i = 0; i < str.length(); i++){
            if (Character.isLowerCase(str.charAt(i))){
                answer += Character.toUpperCase(str.charAt(i));
            } else {
                answer += Character.toLowerCase(str.charAt(i));
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
