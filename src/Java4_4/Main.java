package Java4_4;

import java.util.*;

// 2023.06.26*
public class Main {
    public int solution(String a, String b){
        int answer = 0;

        // b map
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < b.length(); i++){
            map.put(b.charAt(i), map.getOrDefault(b.charAt(i), 0)+1);
        }
        // a map
        Map<Character, Integer> mapA = new HashMap<>();
        for (int i = 0; i < b.length()-1; i++){
            mapA.put(a.charAt(i), mapA.getOrDefault(a.charAt(i), 0)+1);
        }
        int lt = 0;
        for (int rt = b.length()-1; rt < a.length(); rt++){
            mapA.put(a.charAt(rt), mapA.getOrDefault(a.charAt(rt), 0)+1);
            if (mapA.equals(map)) answer++;
            mapA.put(a.charAt(lt), mapA.get(a.charAt(lt))-1);
            if (mapA.get(a.charAt(lt)) == 0) mapA.remove(a.charAt(lt));
            lt++;
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
