package Java2_10;

import java.util.Scanner;

// 2023.06.20
public class Main {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int n, int[][] arr){
        int answer = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                boolean flag = true;
                for (int l = 0; l < 4; l++){
                    int x = i+dx[l];
                    int y = j+dy[l];
                    if (x >= 0 && x < n && y >= 0 && y < n
                    && arr[x][y] >= arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }

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
