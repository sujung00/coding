package Java44;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

public class Main {
    public int solution(int n, int m, int[] arr){
        int answer = 1;
        Queue<Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++){
            Q.offer(new Person(i, arr[i]));
        }
        while (!Q.isEmpty()){
            Person tmp = Q.poll();
            for (Person x : Q){
                if (x.priority>tmp.priority){
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null){
                if (tmp.id == m) return answer;
                else answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(T.solution(n ,m ,arr));
    }
}