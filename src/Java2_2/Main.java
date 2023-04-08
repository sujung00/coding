package Java2_2;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[] heights){
        int answer = 1;

        int max = heights[0];
        for (int i = 1; i < n; i++){
            if (heights[i] > max){
                max = heights[i];
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++){
            heights[i] = scanner.nextInt();
        }

        System.out.println(T.solution(n, heights));
    }
}
