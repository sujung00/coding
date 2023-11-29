package Java2_7;

import java.util.Scanner;

// 2023.06.20
public class Main {
    public int solution(int n, int[] arr){
        int answer = 0;

        int cnt = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == 1){
                answer += ++cnt;
            } else {
                cnt = 0;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
