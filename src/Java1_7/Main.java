package Java1_7;

import java.util.Scanner;

// 2023.06.12
public class Main {
    public String solution(String str){
        String answer = "YES";

        str = str.toUpperCase();
        for (int i = 0; i < str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                answer = "NO";
                return answer;
            }
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
