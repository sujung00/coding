package Java7_12;

import java.util.Scanner;

//5 9
//1 2
//1 3
//1 4
//2 1
//2 3
//2 5
//3 4
//4 2
//4 5

public class Main {
    static int n, m;
    static int[][] graph;
    static int[] ch;
    static int answer;

    public void DFS(int v){
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++){
                if (ch[i] == 0 && graph[v][i] == 1){
                    ch[i] = 1;
                    DFS(i);
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
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for (int i = 0; i < m; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
