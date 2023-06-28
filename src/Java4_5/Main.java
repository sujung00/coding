package Java4_5;

import java.util.*;

// 2023.06.28*
public class Main {
    public int solution(int n, int k, Integer[] arr){
        int answer = -1;

        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for (int l = j+1; l < n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : Tset){
            cnt++;
            if (cnt == k) {
                answer = x;
                break;
           }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
