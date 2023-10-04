package Java8_9;

import java.util.Scanner;

public class Main {
    static int[] combi;
    static int n, m;

    public void DFS(int L, int S){
        if (L == m){
            for (int x : combi){
                System.out.print(x + " ");
            }
            System.out.println();
        }else {
            for (int i = S; i <= n; i++){
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }
}
