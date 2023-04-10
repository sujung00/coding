package Java2_8;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] scores){
        int[] answer = new int[n];

        for (int i = 0; i < n; i++){
            int cnt = 1;
            for (int j = 0; j < n; j++){
                if (scores[i] < scores[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++){
            scores[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, scores)){
            System.out.print(x + " ");
        }
    }
}
