package Java5_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 2023.07.02*
public class Main {
    class Person{
        int id;
        int danger;

        public Person(int id, int danger){
            this.id = id;
            this.danger = danger;
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
                    queue.add(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null){
                answer++;
                if (tmp.id == m){
                    return answer;
                }
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
