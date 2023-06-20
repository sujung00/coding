package Java2_7;

import java.util.Scanner;

// 2023.06.20
public class Main {
    public int solution(int n, int[] numbers){
        int answer = 0;

        int addScore = 1;
        for (int i = 0; i < n; i++){
            if (numbers[i] == 1){
                answer += addScore++;
            } else {
                addScore = 1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n, numbers));
    }
}
