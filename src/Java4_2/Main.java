package Java4_2;

import java.util.HashMap;
import java.util.Scanner;

// 2023.06.24
public class Main {
    public String solution(String a, String b){
        String answer = "NO";

        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();
        for (char x : a.toCharArray()){
            aMap.put(x, aMap.getOrDefault(x, 0)+1);
        }
        for (char x : b.toCharArray()){
            bMap.put(x, bMap.getOrDefault(x, 0)+1);
        }
        if (aMap.equals(bMap)) return "YES";

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
