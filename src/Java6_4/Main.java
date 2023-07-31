package Java6_4;

import java.util.Scanner;

// 2023.07.06*
public class Main {
    public int[] solution(int size, int n, int[] arr){
        int[] answer = new int[size];

        for (int x : arr){
            int pos = -1;
            for (int i = 0; i < size; i++){
                // 똑같은 값이 있다면
                if (x == answer[i]){
                    pos = i;
                }
            }
            // 같은 값이 없다면
            if (pos == -1){
                for (int i = size-1; i >= 1; i--){
                    answer[i] = answer[i-1];
                }
            }
            // 같은 값이 있다면
            else {
                for (int i = pos; i >= 1; i--){
                    answer[i] = answer[i-1];
                }
            }
            answer[0] = x;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for (int x : T.solution(s, n, arr)){
            System.out.print(x + " ");
        }
    }
}
