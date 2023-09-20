package Java7_10;

// Tree 말단 노드까지 가장 짧은 경로(BFS)
// 경로의 길이 : 루트노드에서 말단노드까지 가는데 이동하는 횟수
//             => 간선(예지)의 개수
//      1
//   2     3
// 4   5
// 가장 짧은 길이는 3번 노드까지의 길이인 1이다.

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;

    public Node(int val){
        data = val;
        lt = lt = null;
    }
}

public class Main {
    Node root;

    public int BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()){
            int len = Q.size();
            for (int i = 0; i < len; i++){
                Node x = Q.poll();
                if (x.lt == null && x.rt == null) return L;
                if (x.lt != null) Q.offer(x.lt);
                if (x.rt != null) Q.offer(x.rt);
            }
            L++;
        }

        return 0;
    }
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
