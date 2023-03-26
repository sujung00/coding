package Java1_8;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer  = "NO";

        // A-Z가 아니면 비문자화 시키기
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (tmp.equals(str)) answer = "YES";

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
