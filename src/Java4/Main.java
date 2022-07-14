package Java4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int i, String[] words){
        ArrayList<String> answer = new ArrayList<>();



        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String[] words = new String[count];
        for (int i = 0; i<count; i++){
            words[i] = scanner.next();
        }
        for (String x : T.solution(count, words)){
            System.out.println(x);
        }
    }
}