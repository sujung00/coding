package Java9_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int time;
    char state;

    public Time(int time, char state){
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(Time ob) {
        if (this.time == ob.time) return this.state-ob.state;
        else return this.time-ob.time;
    }
}

public class Main {
    public int solution(ArrayList<Time> arr){
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        for (Time t : arr){
            if (t.state == 's'){
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int arrive = scanner.nextInt();
            int leave = scanner.nextInt();
            arr.add(new Time(arrive, 's'));
            arr.add(new Time(leave, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}
