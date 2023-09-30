package Java7_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    int[] dis = {-1, 1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e){
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while (!Q.isEmpty()){
            int len = Q.size();
            for (int i = 0; i < len; i++){
                int cur = Q.poll();
                for (int j = 0; j < 3; j++){
                    int next = cur + dis[j];
                    if (next == e) return L+1;
                    if (next >= 1 && next <= 10000 && ch[next] == 0){
                        ch[next] = 1;
                        Q.offer(next);
                    }
                }
            }
            L++;
        }

        return 0;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
