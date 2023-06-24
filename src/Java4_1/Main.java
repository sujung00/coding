package Java4_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 2023.06.24*
public class Main {
    public char solution(int n, String str){
        char answer = ' ';

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()){
            if (map.get(key) > max){
                max = map.get(key);
                answer = key;
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
