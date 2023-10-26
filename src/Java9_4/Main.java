package Java9_4;

import java.util.*;

class Lecture implements Comparable<Lecture>{
    int pay, time;

    public Lecture(int pay, int time){
        this.pay = pay;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.time - this.time; // 시간 기준으로 내림차순
    }
}

public class Main {
    static int n, max = Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> arr){
        int answer = 0;

        Collections.sort(arr);
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int j = 0;
        for (int i = max; i >= 1; i--){
            for ( ; j < n; j++){
                if (arr.get(j).time < i) break;
                pQ.offer(arr.get(j).pay);
            }
            if (!pQ.isEmpty()) answer += pQ.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int pay = scanner.nextInt();
            int time = scanner.nextInt();
            arr.add(new Lecture(pay, time));
            if (time > max) max = time;
        }
        System.out.println(T.solution(arr));
    }
}
