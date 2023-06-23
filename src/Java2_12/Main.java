package Java2_12;

import java.util.Scanner;

// 2023.06.21**
public class Main {
    public int solution(int n, int m, int[][] arr){
        int answer = 0;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){ // 모든 학생의 멘토 멘티 경우의 수
                int cnt = 0;
                for (int k = 0; k < m; k++){ // 모든 test 개수
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++){ // test 1개당 학생수
                        // k test에서 i의 등수와 j의 등수
                        // => i와 j가 멘토와 멘티가 될 수 있냐
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
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
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }
}
