package Java4_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

// 2023.06.24
public class Main {
    public String solution(String str1, String str2){
        String answer = "YES";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char x : str1.toCharArray()){
            map1.put(x, map1.getOrDefault(x, 0)+1);
        }
        for (char x : str2.toCharArray()){
            map2.put(x, map2.getOrDefault(x, 0)+1);
        }
        for (char x : map1.keySet()){
            if (!Objects.equals(map1.get(x), map2.get(x))){
                answer = "NO";
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(T.solution(str1, str2));
    }
}
