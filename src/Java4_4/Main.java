package Java4_4;

import java.util.*;

// 2023.06.26*
public class Main {
    public int solution(String s, String t){
        int answer = 0;

        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (char x : t.toCharArray()){
            tmap.put(x, tmap.getOrDefault(x, 0)+1);
        }
        for (int i = 0; i < s.length()-t.length()+1; i++){
            for (int j = 0; j < t.length(); j++){
                smap.put(s.charAt(i+j), smap.getOrDefault(s.charAt(i+j), 0)+1);
            }
            if (tmap.equals(smap)) answer++;
            smap.clear();
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
