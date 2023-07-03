package Java5_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 2023.07.02*
public class Main {
    class Person{
        int id;
        int priority;
        public Person(int id, int priority){
            this.id = id;
            this.priority = priority;
        }
    }
    public int solution(int n, int m, int[] arr){
        int answer = 0;

        Queue<Person> Q = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        // Queue에 집어넣기
        for (int i = 0; i < n; i++){
            Q.offer(new Person(i, arr[i]));
        }
        while (!Q.isEmpty()){
            Person tmp = Q.poll();
            for (Person x : Q){
                if (x.priority > tmp.priority){
                    Q.add(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) return answer;
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