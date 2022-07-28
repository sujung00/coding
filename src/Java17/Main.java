package Java17;

import java.util.Scanner;

public class Main {
    public int solution(int num){
        int answer = 0;
        int[] arr = new int[num+1];
        arr[0] = arr[1] = 0;
        for (int i = 2; i <= num; i++) {  arr[i] = i;  }

        for (int i = 2; i <= (int)Math.sqrt(num); i++) {
            if(arr[i] == 0) continue;
            for (int j = i+i ; j <= num; j+=i) {  arr[j] = 0; }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println(T.solution(num));
    }
}
