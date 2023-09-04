package Java8_2;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    static int answer = Integer.MIN_VALUE, c, n;

    public void DFS(int L, int sum, int[] arr){
        if (sum > c) return;
        if (L == n){
            answer = Math.max(answer, sum);
        } else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
