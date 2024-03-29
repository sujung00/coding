package Java2_11;

import java.util.Scanner;

// 2023.06.21*
public class Main {
    public int solution(int n, int[][] arr){
        int answer = 0;

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++){
            int cnt = 0;
            for (int j = 1; j <= n; j++){
                for (int k = 1; k <= 5; k++){
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        // 학생 수를 세는 거기 때문에 여러명으로 count 되지 않게 break
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n+1][6];
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= 5; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}