package Java1_3;

import java.util.Scanner;

//split
public class Main {
    public String solution(String str){
        int len = Integer.MIN_VALUE;
        String answer = "";
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++){
            if (strArr[i].length() > len) {
                len = strArr[i].length();
                answer = strArr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(T.solution(input));
    }
}
