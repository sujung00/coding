package Java45;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr){

//        int idx, tmp;
//        for (int i = 0; i < n-1; i++){
//            idx = i;
//            for (int j = i+1; j < n; j++){
//                if (arr[j] < arr[idx]) idx = j;
//            }
//            tmp = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = tmp;
//        }

        int min, tmp;
        for (int i = 0; i < n-1; i++){
            min = i;
            for (int j = i+1; j < n; j++){
                if (arr[min] > arr[j]){
                    tmp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
