package Java2_2;

import java.util.Scanner;

// 2023.06.19
public class Main {
    public int solution(int n, int[] numbers){
        int answer = 1;

        int maxHeight = numbers[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++){
            if (numbers[i] > maxHeight){
                maxIndex = i;
                maxHeight = numbers[i];
                answer++;
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
