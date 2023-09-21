package Java1_2;

import java.util.Scanner;

// 2023.06.10

public class Main {

    public String solution(String str){
        String answer = "";

        for (char x : str.toCharArray()){
            if (Character.isUpperCase(x)){
                x = Character.toLowerCase(x);
                answer += x;
            } else {
                x = Character.toUpperCase(x);
                answer += x;
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
