package Java1_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 2023.06.10 *
public class Main {
    public List<String> solution(int num, String[] strings){
        List<String> answer = new ArrayList<>();

        for (String x : strings){
            char[] arr = x.toCharArray();
            for (int i = 0; i < arr.length/2; i++){
                char c = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = c;
            }
            x = String.valueOf(arr);
            answer.add(x);
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