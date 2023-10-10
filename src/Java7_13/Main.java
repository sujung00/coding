package Java7_13;

import java.util.ArrayList;
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
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v){
        if (v == n) answer++;
        else {
            for (int x : graph.get(v)){
                if (ch[x] == 0){
                    ch[x] = 1;
                    DFS(x);
                    ch[x] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        ch = new int[n+1];
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++){
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
