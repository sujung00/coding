package Java4_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

// 2023.06.24
public class Main {
    public String solution(String a, String b){
        String answer = "YES";

        Map<Character, Integer> amap = new HashMap<>();
        Map<Character, Integer> bmap = new HashMap<>();
        for (char x : a.toCharArray()){
            amap.put(x, amap.getOrDefault(x, 0)+1);
        }
        for (char x : b.toCharArray()){
            bmap.put(x, bmap.getOrDefault(x, 0)+1);
        }
        for (char x : amap.keySet()){
            if (amap.get(x) != bmap.get(x)){
                return "NO";
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(T.solution(a, b));
    }
}
