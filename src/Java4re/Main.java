package Java4re;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(String[] words){
        ArrayList<String> answer = new ArrayList<>();

        /*for (String x : words){
            String reverce = new StringBuilder(x).reverse().toString();
            answer.add(reverce);
        }*/
        for (String x : words){
            char[] s = x.toCharArray();
            int lt =0, rt = x.length()-1;
            while (lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String[] words = new String[count];

        for (int i=0; i<count; i++) {
            words[i] = scanner.next();
        }

        for (String x : T.solution(words)){
            System.out.println(x);
        }
    }
}