package Java2_9;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[][] nums) {
        int answer = Integer.MIN_VALUE;

        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            // 합 초기화
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++){
                // sum1 : 행의 합
                sum1 += nums[i][j];
                // sum2 : 열의 합
                sum2 += nums[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        //합 초기화
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++){
            // 행과 열 번호가 같다 => 대각선 합의 값
            sum1 += nums[i][i];
            sum2 += nums[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                nums[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, nums));
    }
}
