package Java32;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public char solution(int n, String s){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        int max = Integer.MIN_VALUE;

        for (char key : map.keySet()){
            //System.out.println(key + " " + map.get(key));
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
