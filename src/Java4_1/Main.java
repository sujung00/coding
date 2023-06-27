package Java4_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 2023.06.24*
public class Main {
    public char solution(int n, String str){
        char answer = ' ';

        Map<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for (char x : map.keySet()){
            if (map.get(x) > max){
                max = map.get(x);
                answer = x;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(T.solution(n, str));
    }
}
