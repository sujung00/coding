package Java46;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr){

        for (int i = n-1; i >= 0; i--) {
            int tmp;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
