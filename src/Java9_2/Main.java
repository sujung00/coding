package Java9_2;

import java.util.Scanner;

public class Main {
    public int solution(String s){
        int answer = 0;

        for (char x : s.toCharArray()){
            if (x>=48 && x<=57) answer = answer*10+(x-48);
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
