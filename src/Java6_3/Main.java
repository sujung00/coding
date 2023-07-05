package Java6_3;

import java.util.Scanner;

// 2023.07.05*
public class Main {
    public int[] solution(int n, int[] arr){
        for (int i = 1; i < n; i++){
            int tmp = arr[i], j;
            for (j = i-1; j >= 0; j--){
                if (arr[j]>tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1]= tmp;
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
