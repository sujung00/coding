package Java8_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 동전교환
public class Main {
    static int n, m, answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum, Integer[] arr){
        if (sum > m) return;
        if (L >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, L);
        }
        else {
            for (int i = 0; i < n; i++){
                DFS(L+1, sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = scanner.nextInt();
        T.DFS(0,0, arr);
        System.out.println(answer);
    }
}
