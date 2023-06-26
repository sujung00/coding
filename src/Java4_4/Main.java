package Java4_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public int solution(String str1, String str2){
        int answer = 0;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        for (char x : str2.toCharArray()){
            bm.put(x, bm.getOrDefault(x, 0)+1);
            int L = str2.length()-1;
            for (int i = 0; i < L; i++){
                am.put(str1.charAt(i), am.getOrDefault(str1.charAt(i), 0)+1);
                int lt = 0;
                for (int rt = L; rt < str1.length(); rt++){
                    am.put(str1.charAt(rt), am.getOrDefault(str1.charAt(i), 0)+1);
                    if (am.equals(bm)) answer++;
                    am.put(str1.charAt(lt), am.get(str1.charAt(lt))-1);
                    if (am.get(str1.charAt(lt))==0){
                        am.remove(str1.charAt(lt));
                    }
                    lt++;
                }
            }
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
