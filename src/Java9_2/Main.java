package Java9_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int start, end;

    public Time(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if (o.end == this.end) return this.start-o.start;
        else return this.end - o.end; // 끝나는 시간 기준 오름차순
    }
}

public class Main {
    public int solution(ArrayList<Time> arr, int n){
        int cnt = 0;

        Collections.sort(arr);
        int et = 0;
        for (Time t : arr){
            if (t.start >= et){
                cnt++;
                et = t.end;
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            arr.add(new Time(start, end));
        }
        System.out.println(T.solution(arr, n));
    }
}
