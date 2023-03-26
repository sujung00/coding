package Java1_3.review2;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        String[] words = str.split(" ");

        for (String x : words){
            if (x.length() > answer.length()){
                answer = x;
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
