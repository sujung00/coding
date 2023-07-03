package Java6_1;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr){
        int[] answer = arr;

        for (int i = 0; i < n; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j = i+1; j <n; j++){
                if (answer[j] < min){ // 최솟값 구하기
                    min = answer[j];
                    minIndex = j;
                }
            }
            if (min < answer[i]){
                int tmp = answer[i];
                answer[i] = answer[minIndex];
                answer[minIndex] = tmp;
            }
        }

        return answer;
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
