package Java3_6;

import java.util.Scanner;

public class Main {
    public int solution(int n){
        int answer = 0, sum = 0, lt = 0;
        int m = n/2 + 1; //몫 + 1
        int[] arr = new int[m];// ex) 1 2 3 4 5 6 7 8 배열

        for (int i = 0; i < m; i++) arr[i] = i+1; //ex) 1 2 3 4 5 6 7 8 배열 만들기
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
