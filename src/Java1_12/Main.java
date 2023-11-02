package Java1_12;

import java.util.Scanner;

// 2023.06.18 ^
public class Main {
    public String solution(int n, String str){
        String answer = "";

        str = str.replaceAll("#", "1").replaceAll("[*]", "0");
        for (int i = 0; i < str.length()-1; i+=7){
            String tmp = str.substring(i, i+7);
            int num = Integer.valueOf(tmp, 2);
            char c = (char)num;
            answer += c;
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
