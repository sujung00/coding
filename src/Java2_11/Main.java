package Java2_11;

import java.util.Scanner;

// 2023.06.21*
public class Main {
    public int solution(int n, int[][] arr){
        int answer = 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){ // 학생 i
            int cnt = 0;
            for (int j = 0; j < n; j++){ // n명 학생
                for (int k = 0; k < 5; k++){ // 5학년
                    if (arr[j][k] == arr[i][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max){
                max = cnt;
                answer = i+1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 5; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}