package Java1_3;

import java.util.Scanner;

// 2023.06.10
public class Main {
    public String solution(String str){
       String[] strArr = str.split(" ");

       String max = "";
       for (String x : strArr){
           if (x.length() > max.length()) max = x;
       }

       return max;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
