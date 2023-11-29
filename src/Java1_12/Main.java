package Java1_12;

import java.util.Scanner;

// 2023.06.18 ^
public class Main {
    public String solution(int n, String str){
        String answer = "";

        for (int i = 0; i < str.length(); i=i+7){
            String s = str.substring(i, i+7);
            s = s.replaceAll("#", String.valueOf(1)).replaceAll("[*]", String.valueOf(0));
            int num = Integer.valueOf(s, 2);
            char result = (char)num;
            answer += result;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(T.solution(n, str));
    }
}
