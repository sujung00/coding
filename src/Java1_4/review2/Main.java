package Java1_4.review2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String[] words = new String[num];

        for (int i = 0; i < num; i++){
             words[i] = scanner.next();
        }

        for (String x : T.solution(words)){
            System.out.println(x);
        }

    }
}
