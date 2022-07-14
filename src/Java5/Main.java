package Java5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";

        char[] s = str.toCharArray();
        int lt =0, rt = str.length()-1;

        while (lt<rt){
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] =s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(T.solution(str));
    }
}
