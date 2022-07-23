package Java6.review;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";

        for (int i = 0; i < str.length(); i++){
            if (str.indexOf(str.charAt(i)) == i) answer+=str.charAt(i);
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
