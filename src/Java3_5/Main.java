package Java3_5;

import java.util.Scanner;

// 2023.06.23*
public class Main {
    public int solution(int n){
        int answer = 0;

        int[] arr = new int[n/2+1];
        for (int i = 0; i < n/2+1; i++){
            arr[i] = i+1;
        }
        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < n/2+1; rt++){
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n){
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(T.solution(n));
    }
}
