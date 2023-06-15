package Java1_8;

import java.util.Scanner;

// 2023.06.15
public class Main {
    public String solution(String str){
        String answer = "YES";

        str = str.toUpperCase();
        int lt = 0, rt = str.length()-1;
        while (lt < rt){
            if (Character.isAlphabetic(str.charAt(lt))){
                if (Character.isAlphabetic(str.charAt(rt))){
                    // 양쪽 다 알파벳이면
                    if (str.charAt(lt) != str.charAt(rt)){
                        answer = "NO";
                        return answer;
                    } else {
                        lt++;
                        rt--;
                    }
                } else rt--;
            } else lt++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
