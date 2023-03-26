package Java1_3.review;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        String[] words = str.split(" ");

        for (String w : words){
            if (w.length()> answer.length()){
                answer = w;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        //한줄을 전부 받아와야하기 때문
        String str = scanner.nextLine();

        System.out.println(T.solution(str));
    }
}
