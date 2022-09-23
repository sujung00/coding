package Java47;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr){

        for (int i = 1; i < n; i++){
            int idx = i;
            for (int j = i-1; j >=0; j--){
                if (arr[j] > arr[idx]){
                    int tmp = arr[j];
                    arr[j] = arr[idx];
                    arr[idx] = tmp;
                    idx = j;
                }
                else {
                    break;
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
