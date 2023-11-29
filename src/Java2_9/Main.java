package Java2_9;

import java.util.Scanner;

// 2023.06.20*
public class Main {
    public int solution(int n, int[][] arr){
        int answer = 0;

        int sum = 0;
        for (int i = 0; i < n; i++){
            int s1 = 0;
            int s2 = 0;
            for (int j = 0; j < n; j++){
                //가로 합
                s1 += arr[i][j];
                //세로 합
                s2 += arr[j][i];
            }
            sum = Math.max(sum, s1);
            sum = Math.max(sum, s2);
        }
        int s1 = 0;
        for (int i = 0; i < n; i++){
            s1 += arr[i][i];
        }
        sum = Math.max(sum, s1);

        s1 = 0;
        for (int i = n-1; i >= 0; i--){
            s1 = arr[i][i];
        }
        sum = Math.max(sum, s1);
        answer = sum;

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
