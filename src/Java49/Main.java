package Java49;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public String solution(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr); //오름차순 정렬 후
        for (int i = 0; i < n-1; i++){
            if (arr[i] == arr[i+1]) return "D"; //같은 것이 있으면 D 리턴
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
