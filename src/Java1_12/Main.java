package Java1_12;

import java.util.Scanner;

public class Main {
    public String solution(int n, String str) {
        String answer = "";

        str = str.replaceAll("#", "1").replaceAll("[*]", "0");

        for (int i = 0; i < n; i++) {
            String s = str.substring(str.length()/n*i, str.length()/n*(i+1));
            int c = Integer.valueOf(s, 2);
            answer += (char)c ;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(T.solution(n, str));
    }
}
