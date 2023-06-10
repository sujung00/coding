package Java1_3;

import java.util.Scanner;

// 2023.06.10
public class Main {
    public String solution(String str){
        String[]strArr = str.split(" ");
        int maxLength = strArr[0].length();
        String maxWord = strArr[0];
        for (int i = 1; i < strArr.length; i++){
            if (strArr[i].length() > maxLength){
                maxLength = strArr[i].length();
                maxWord = strArr[i];
            }
        }

        return maxWord;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
