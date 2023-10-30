package Java1_9;

import java.util.Scanner;

// 2023.06.16
public class Main {
    public int solution(String str){
        String answer = "";

        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length()-1; i++){
            if (!Character.isAlphabetic(arr[i])){
                answer += arr[i];
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
