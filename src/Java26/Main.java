package Java26;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int[] arr, int m, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m){
            if (arr[p1] < arr2[p2]) answer.add(arr[p1++]);
            else answer.add(arr2[p2++]);
        }
        while (p1 < n) answer.add(arr[p1++]);
        while (p2 < m) answer.add(arr2[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0 ; i < m; i++){
            arr2[i] = scanner.nextInt();
        }

        for (int x : T.solution(n , arr, m, arr2)) System.out.print(x + " ");
    }
}
