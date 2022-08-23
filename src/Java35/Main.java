package Java35;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public int solution(String a, String b){
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for (char x : b.toCharArray()){
            bm.put(x, bm.getOrDefault(x, 0)+1);
        }

        int l = b.length()-1;
        int lt = 0;

        for (int i = 0; i < l; i++){
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
        }

        for (int rt = l; rt < a.length(); rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
            if (am.equals(bm)) answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if (am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
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
