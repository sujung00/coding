package Java6_8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[] arr){
        int answer = 0;

        Arrays.sort(arr);
        int lt = 0, rt = n-1;
        while (lt <= rt){
            int mid = (lt+rt)/2;
            if(m > arr[mid]){
                lt = mid+1;
            } else if(m < arr[mid]){
                rt = mid-1;
            } else {
                return mid+1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
