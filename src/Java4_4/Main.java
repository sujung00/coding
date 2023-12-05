package Java4_4;

import java.util.*;

// 2023.06.26*
public class Main {
    public int solution(String s, String t){
        int answer = 0;

        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++){
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0)+1);
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < t.length()-1; i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
        }
        int lt = 0;
        for (int rt = t.length()-1; rt < s.length(); rt++){
            sMap.put(s.charAt(rt), sMap.getOrDefault(s.charAt(rt), 0)+1);
            if (sMap.equals(tMap)) answer++;
            sMap.put(s.charAt(lt), sMap.get(s.charAt(lt))-1);
            if (sMap.get(s.charAt(lt)) == 0) sMap.remove(s.charAt(lt));
            lt++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(T.solution(s, t));
    }
}
