package Java5_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 2023.07.01*
public class Main {
    public int solution(int n, int k){
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++){
            queue.add(i);
        }
        int cnt = 0;
        while (!queue.isEmpty()){
            cnt++;
            if (queue.size() == 1){
                return queue.poll();
            } else {
                if (cnt % k == 0){
                    queue.poll();
                } else {
                    int tmp = queue.poll();
                    queue.add(tmp);
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(T.solution(n, k));
    }
}
