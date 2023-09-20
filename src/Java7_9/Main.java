package Java7_9;

// Tree 말단 노드까지 가장 짧은 경로(DFS)
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
        lt = rt = null;
    }
}
public class Main {
    Node root;
    public int DFS(int L, Node root){
        if (root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
