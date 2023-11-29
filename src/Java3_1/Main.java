package Java3_1;

import java.util.Arrays;
import java.util.Scanner;

// 2023.06.21
public class Main {
    public int[] solution(int n, int m, int[] arr1, int[] arr2){
        int[] answer = new int[n+m];

        for (int i = 0; i < n; i++){
            answer[i] = arr1[i];
        }
        for (int i = n; i < n+m; i++){
            answer[i] = arr2[i-n];
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++){
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++){
            arr2[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, m, arr1, arr2)){
            System.out.print(x + " ");
        }
    }
}
