package Java1_5;

import java.util.Scanner;

// 2023.06.10 ^
public class Main {
    public int solution(int n){
        int answer = 0;

        int[] arr = new int[n+1];
        for (int i = 2; i < n+1; i++){
            if (arr[i] == 0){
                answer++;
                for (int j = i; j < n+1; j = j+i){
                    arr[j] = 1;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(T.solution(n));
    }
}
