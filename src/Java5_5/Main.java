package Java5_5;

import java.util.*;

// 2023.06.30*
public class Main {
    public int solution(int n, int k, int[] arr){
        int answer = -1;

        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for (int l = j+1; l < n; l++){
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : Tset){
            cnt++;
            if (cnt == k){
                return x;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
