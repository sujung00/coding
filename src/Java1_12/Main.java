package Java1_12;

import java.util.Scanner;

// 2023.06.18 ^
public class Main {
    public String solution(int num, String str){
        String answer = "";

        str = str.replaceAll("#", String.valueOf(1)).replaceAll("[*]", String.valueOf(0));
        for (int i = 0; i < num; i++){
            // #****##(0~6) => 1000011 => C
            // #**####(7~13) => 1001111 => O
            // #**####(14~20) => 1001111 => O
            // #**##**(21~27) => 1001100 => L
            String s = str.substring(i*7, (i+1)*7); // 1000011
            char c = (char)Integer.parseInt(s, 2);
            answer += c;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = scanner.next();
        System.out.println(T.solution(num, str));
    }
}
