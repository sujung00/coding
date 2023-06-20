package Java2_9;

import java.util.Scanner;

// 2023.06.20*
public class Main {
    public int solution(int n, int[][] numbers){
        int answer = 0;

        // 각 행의 합, 각 열의 합, 두 대각선의 합
        // 각 행과 열의 합
        int sum1, sum2;
        for (int i = 0; i < n; i++){
            sum1=sum2=0;
            for (int j = 0; j < n; j++){
                sum1 += numbers[i][j];
                sum2 += numbers[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        // 두 대각선의 합
        sum1= sum2 = 0;
        for (int i = 0; i < n; i++){
            sum1 += numbers[i][i];
            sum2 += numbers[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] numbers = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                numbers[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, numbers));
    }
}
