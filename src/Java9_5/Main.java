package Java9_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    int vex, cost;

    public Edge(int vex, int cost){
        this.vex = vex; // 정점
        this.cost = cost; // 비용
    }

    @Override
    public int compareTo(Edge ob) {
        return this.cost - ob.cost; // 오름차순
    }
}

public class Main {
    static int[] dis;
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;

    public void solution(int v){
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v, 0));
        dis[v] = 0;
        while (!pQ.isEmpty()){
            Edge tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if (nowCost > dis[now]) continue;
            for (Edge ob : graph.get(now)){
                if (dis[ob.vex] > nowCost+ob.cost){
                    dis[ob.vex] = nowCost+ob.cost;
                    pQ.offer(new Edge(ob.vex, nowCost+ob.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i <= n; i++){
            graph.add(new ArrayList<Edge>());
        }
        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for (int i = 0; i < m; i++){
            int s = scanner.nextInt();
            int e = scanner.nextInt();
            int len = scanner.nextInt();
            graph.get(s).add(new Edge(e, len));
        }
        T.solution(1);
        for (int i = 2; i <= n; i++){
            if (dis[i]!=Integer.MAX_VALUE){
                System.out.println(i + " : " + dis[i]);
            } else {
                System.out.println(i + " : " + "impossible");
            }
        }
    }
}
