package Java3;

import java.util.Scanner;

//split
public class Main {
    public String solution(String str){
        String answer ="";
        String[] words = str.split(" ");

        for (String w : words) {
            if (w.length() > answer.length()){
                answer = w;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(T.solution(input));
    }
}
