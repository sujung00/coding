package Java2_8;

import java.util.*;

// 2023.06.20*
public class Main {
    public int[] solution(int n, Integer[] numbers){
        int[] answer = new int[n];

        for (int i = 0; i < n; i++){
            int grade = 1;
            for (int j = 0; j < n; j++){
                if (numbers[j] > numbers[i]) grade++;
            }
            answer[i] = grade;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] numbers = new Integer[n];
        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, numbers)){
            System.out.print(x + " ");
        }
    }
}
