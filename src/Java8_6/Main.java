package Java8_6;

import java.util.Scanner;

// 순열 구하기

public class Main {
    static int n, m;
    static int[] arr, ch, pm;

    public void DFS(int L){
        if (L == m){
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++){
                if (ch[i] == 0){
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[n];
        ch = new int[n];
        pm = new int[m];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        T.DFS(0);
    }
}
