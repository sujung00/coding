package Java1_4.review;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(String[] words) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : words) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Java1_4.Main T = new Java1_4.Main();
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            words[i] = scanner.next();
        }

        for (String x : T.solution(words)) {
            System.out.println(x);
        }
    }
}