package Java9_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
    int h, w;

    public Body(int h, int w){
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o) {
        return o.h-this.h; // 내림차순
    }
}

public class Main {
    public int solution(ArrayList<Body> arr, int n){
        int cnt = 0;

        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body ob : arr){
            if (ob.w > max){
                max = ob.w;
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr, n));
    }
}
