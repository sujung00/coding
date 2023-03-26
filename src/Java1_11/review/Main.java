package Java1_11.review;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        str = str + " ";
        int num = 1;

        for (int i = 0; i < str.length()-1 ; i++){
            if (str.charAt(i) == str.charAt(i+1)){
                num++;
            }else {
                answer += str.charAt(i);
                if (num > 1){
                    answer += num;
                }
                num = 1;
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
