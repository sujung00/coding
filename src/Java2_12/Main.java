package Java2_12;

import java.util.Scanner;

// 2023.06.21**
public class Main {
    public int solution(int n, int m, int[][] arr){
        int answer = 0;

        // 멘토
        for (int i = 1; i <= n; i++){
            // 멘티
            for (int j = 1; j <= n; j++){
                // 시험 수
                int cnt = 0;
                for (int k = 0; k < m; k++){
                    // 등수
                    int pi = 0, pj = 0;
                    for (int l = 0; l < n; l++){
                        // 각자의 등수 알아내기
                        if (arr[k][l] == i) pi = l;
                        if (arr[k][l] == j) pj = l;
                    }
                    // 멘티의 등수가 더 높으면 cnt 증가
                    if (pi < pj) cnt++;
                }
                // cnt 값이 시험 수와 동일하면 answer 증가
                if (cnt == m){
                    answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 학생 수
        int m = scanner.nextInt(); // 시험 수
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }
}
