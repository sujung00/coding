package Java1_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 2023.06.10 *
public class Main {
    public List<String> solution(int num, String[] strings){
        List<String> answer = new ArrayList<>();

        for (String x : strings) {
            char[] chars = x.toCharArray();
            int lt = 0, rt = chars.length-1;
            while (lt < rt){
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
            String word = String.valueOf(chars);
            answer.add(word);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] strings = new String[num];
        for (int i = 0; i < num; i++){
            strings[i] = scanner.next();
        }
        for (String s : T.solution(num, strings)){
            System.out.println(s);
        }
    }
}