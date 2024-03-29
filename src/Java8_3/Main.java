package Java8_3;

import java.util.Scanner;

public class Main {
    static int n, m;
    static int answer = Integer.MIN_VALUE;
    boolean flag = false;
    public void DFS(int L, int sum, int time, int[] ps, int[] pt){
        if (flag) return;
        if (time > m) return;
        if (L == n){
            answer = Math.max(sum, answer);
        } else {
            DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
