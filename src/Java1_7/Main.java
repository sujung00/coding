package Java1_7;

import java.util.Scanner;

// 2023.06.12
public class Main {
    public String solution(String str){
        String answer = "YES";

        str = str.toUpperCase();
        int lt = 0, rt = str.length()-1;
        while (lt < rt){
            if (str.charAt(lt) != str.charAt(rt)){
                return "NO";
            }else {
                lt++;
                rt--;
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
