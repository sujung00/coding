package Java8;

import java.util.Scanner;

public class Main {
    public String solution(String s){
        String answer = "YES";

        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        for (int i = 0; i < s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length()-1-i)) answer = "NO";
        }
        /*String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) answer = "YES";*/

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(T.solution(str));
    }
}
