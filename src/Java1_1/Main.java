package Java1_1;

import java.util.Scanner;

// 2023.06.10

public class Main {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char t = scanner.next().charAt(0);
        System.out.println(T.solution(str, t));
    }
}
