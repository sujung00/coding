package Java1_9;

import java.util.Scanner;

public class Main {
    public int solution(String str){
        String answer = "";

        for (int i = 0; i < str.length(); i++){
            if (!Character.isAlphabetic(str.charAt(i))){
                answer += str.charAt(i);
            }
        }

        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
