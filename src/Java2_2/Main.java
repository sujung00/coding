package Java2_2;

import java.util.Scanner;

// 2023.06.19
public class Main {
    public int solution(int n, int[] arr){
        int answer = 1;

        int max = arr[0];
        for (int x : arr){
            if (x > max){
                max = x;
                answer++;
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
