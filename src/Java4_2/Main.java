package Java4_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

// 2023.06.24
public class Main {
    public String solution(String str1, String str2){
        String answer = "YES";

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : str1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }
        for (char c : str2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }
        for (char c : map1.keySet()){
            if (!Objects.equals(map1.get(c), map2.get(c))) answer = "NO";
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println(T.solution(str1, str2));
    }
}
