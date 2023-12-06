package Java5_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 2023.07.02*
public class Main {
    class Person{
        int danger;
        int sequence;

        public Person(int sequence, int danger){
            this.danger = danger;
            this.sequence = sequence;
        }
    }

    public int solution(int n, int m, int[] arr){
        int answer = 0;

        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++){
            queue.add(new Person(i, arr[i]));
        }
        while (!queue.isEmpty()){
            Person tmp = queue.poll();
            for (Person x : queue){
                if (x.danger > tmp.danger){
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.sequence == m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
