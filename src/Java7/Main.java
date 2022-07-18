package Java7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        int len = str.length();
        str = str.toUpperCase();

        for (int i = 0; i < len/2; i++){
            if (str.charAt(i) != str.charAt(len-1-i)) return "NO";
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
