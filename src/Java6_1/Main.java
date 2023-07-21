package Java6_1;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr){
        // 최솟값이랑 값 교환
        for (int i = 0; i < n-1; i++){
            // 최솟값 구하기
            int minIndex = i;
            for (int j = i+1; j < n; j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            // 값 교환하기
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }

        return arr;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
