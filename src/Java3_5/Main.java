package Java3_5;

import java.util.Scanner;

// 2023.06.23*
public class Main {
    public int solution(int n){
        int answer = 0, sum = 0, lt = 0;

        int m = n/2+1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) arr[i]=i+1; // 숫자 집어 넣기
        for (int rt = 0; rt < m; rt++){
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n){
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(T.solution(n));
    }
}
