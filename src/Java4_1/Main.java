package Java4_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 2023.06.24*
public class Main {
    public char solution(int n, String str){
        char answer = ' ';

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char x : str.toCharArray()){
            hashMap.put(x, hashMap.getOrDefault(x, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for (char x : hashMap.keySet()){
            if (hashMap.get(x) > max){
                max = hashMap.get(x);
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
