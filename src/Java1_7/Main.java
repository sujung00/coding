package Java1_7;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "YES";

        str = str.toLowerCase();
        int lt = 0, rt = str.length()-1;
        while (lt < rt){
            if (str.charAt(lt) == str.charAt(rt)){
                lt++;
                rt--;
            } else {
                answer = "NO";
                break;
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
