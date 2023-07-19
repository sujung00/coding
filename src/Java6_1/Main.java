package Java6_1;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr){
        for (int i = 0; i < n; i++){
            int minIndex = 0;
            int minValue = arr[i];
            for (int j = i+1; j < n; j++){
                if (minValue > arr[j]){
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            if (minValue != arr[i]){
                int tmp = arr[i];
                arr[i] = minValue;
                arr[minIndex] = tmp;
            }
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
