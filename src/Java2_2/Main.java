package Java2_2;

import java.util.Scanner;

// 2023.06.19
public class Main {
    public int solution(int n, int[] arr){
        int answer = 1;

        int min = arr[0];
        for (int i = 1; i < n; i++){
            if (min < arr[i]) {
                answer++;
                min = arr[i];
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
