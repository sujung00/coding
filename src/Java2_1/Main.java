package Java2_1;

import java.util.ArrayList;
import java.util.Scanner;

// 2023.06.19
public class Main {
    public ArrayList<Integer> solution(int n, int[] numbers){
        ArrayList<Integer> answer = new ArrayList<Integer>();

        answer.add(numbers[0]);
        for (int i = 1; i < n; i++){
            if (numbers[i] > numbers[i-1]){
                answer.add(numbers[i]);
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
        for (int num : T.solution(n, numbers)){
            System.out.print(num + " ");
        }
    }
}
