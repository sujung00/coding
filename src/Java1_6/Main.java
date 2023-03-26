package Java1_6;

import java.util.Scanner;

//중복문자제거
public class Main {
    public String solution(String str){
        String answer = "";

        for (int i = 0; i < str.length(); i++){
            if (i == str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
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
