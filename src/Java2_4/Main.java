package Java2_4;

import java.util.Scanner;

// 2023.06.19
public class Main {
    public int[] solution(int n){
        int[] answer = new int[n];

        answer[0] = answer[1] = 1;
        for (int i = 2; i < n; i++){
            answer[i] = answer[i-1]+answer[i-2];
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int x : T.solution(n)){
            System.out.print(x + " ");
        }
    }
}
