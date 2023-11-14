package Java2_10;

import java.util.Scanner;

// 2023.06.20
public class Main {
    public int solution(int n, int[][] arr){
        int answer = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                int cnt = 0;
                for (int k = 0; k < 4; k++){
                    if (arr[i][j] > arr[i+dx[k]][j+dy[k]]){
                        cnt++;
                    } else {
                        break;
                    }
                }
                if (cnt == 4) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n+2][n+2];
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
