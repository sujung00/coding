package Java3_4;

import java.util.Scanner;

// 2023.06.23*
public class Main {
    public int solution(int n, int m, int[] arr){
        int answer = 0;

        int lt = 0, sum = 0;
        for (int rt = 0; rt < n; rt++){
            sum += arr[rt];
            if (sum == m) answer++;
            while (sum >= m){
                sum -= arr[lt++];
                if (sum == m) answer++;
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
