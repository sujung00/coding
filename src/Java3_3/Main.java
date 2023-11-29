package Java3_3;

import java.util.Scanner;

// 2023.06.21* => runtime error
public class Main {
    public int solution(int n, int k, int[] arr){
        int answer, sum = 0;

        for (int i = 0; i < k; i++){
            sum += arr[i];
        }
        answer = sum;
        for (int i = k; i < n; i++){
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
