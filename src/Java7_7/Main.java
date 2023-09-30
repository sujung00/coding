package Java7_7;

// 이진트리 순회(넓이우선탐색-BFS : 레벨탐색)
// 아래 그림과 같은 이진트리를 전위순회와 후위순회를 연습해보세요.
//      1
//   2      3
// 4   5  6   7
// 레벨 탐색 순회 출력 : 1 2 3 4 5 6 7

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

    public void BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        int L = 0;
        queue.offer(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++){
                Node cur = queue.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) queue.offer(cur.lt);
                if (cur.rt != null) queue.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}
