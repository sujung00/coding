package Java1_5;

import java.util.Scanner;

// 2023.06.10 ^
public class Main {
    public String solution(String str){
        String answer = "";

        char[] arr = str.toCharArray();
        int lt = 0, rt = arr.length-1;
        while (lt < rt){
            if (!Character.isAlphabetic(arr[lt])) lt++;
            else if (!Character.isAlphabetic(arr[rt])) rt--;
            else{
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(arr);

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
