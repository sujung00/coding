package Java1_11;

import java.util.Scanner;

// 2023.06.18
public class Main {
    public String solution(String str){
        String answer = "";

        str = str + " ";
        int cnt = 1;
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == str.charAt(i-1)) cnt++;
            else {
                if (cnt == 1){
                    answer += str.charAt(i-1);
                }else {
                    answer += str.charAt(i-1)+String.valueOf(cnt);
                }
                cnt = 1;
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
