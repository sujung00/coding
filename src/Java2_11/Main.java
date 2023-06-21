package Java2_11;

import java.util.Scanner;

// 2023.06.21*
public class Main {
    public int solution(int n, int[][] numbers){
        int answer = 0; // 몇 번 학생이 임시 반장인지

        int maxCnt = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++){
            int cnt = 0;
            for (int j = 1; j <= n; j++){
                for (int k = 1; k <= 5; k++){
                    if (numbers[i][k] == numbers[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > maxCnt) {
                maxCnt = cnt;
                answer = i+1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] numbers = new int[n+1][6];
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= 5; j++){
                numbers[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, numbers));
    }
}