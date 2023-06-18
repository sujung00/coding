package Java1_11;

import java.util.Scanner;

// 2023.06.18
public class Main {
    public String solution(String str){
        String answer = "";

        char[] c = new char[str.length()+1];
        for (int i = 0; i < str.length(); i++){
            c[i] = str.charAt(i);
        }
        c[str.length()] = ' ';

        int n = 1;
        for (int i = 0; i < c.length-1; i++){
            if(c[i] == c[i+1]){
                n++;
            } else {
                answer += c[i];
                if (n > 1){
                    answer += n;
                }
                n = 1;
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
