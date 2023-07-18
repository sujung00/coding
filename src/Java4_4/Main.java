package Java4_4;

import java.util.*;

// 2023.06.26*
public class Main {
    public int solution(String a, String b){
        int answer = 0;

        Map<Character, Integer> amap = new HashMap<>();
        Map<Character, Integer> bmap = new HashMap<>();
        for (int i = 0; i < b.length()-1; i++){
            amap.put(a.charAt(i), amap.getOrDefault(a.charAt(i), 0)+1);
        }
        for (char x : b.toCharArray()){
            bmap.put(x, bmap.getOrDefault(x, 0)+1);
        }
        int lt = 0;
        for (int rt = b.length()-1; rt < a.length(); rt++){
            amap.put(a.charAt(rt), amap.getOrDefault(a.charAt(rt), 0)+1);
            if (amap.equals(bmap)) answer++;
            amap.put(a.charAt(lt), amap.get(a.charAt(lt))-1);
            if (amap.get(a.charAt(lt)) == 0){
                amap.remove(a.charAt(lt));
            }
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
