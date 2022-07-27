package Java13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int num, int[] numbers){
        ArrayList<Integer> answers = new ArrayList<>();

        answers.add(numbers[0]);
        for (int i = 1; i <num; i++){
            if (numbers[i-1] < numbers[i]){
                answers.add(numbers[i]);
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] numbers = new int[num];

        for (int i = 0; i < num; i++){
            numbers[i] = scanner.nextInt();
        }

        for (int x : T.solution(num, numbers)){
            System.out.print(x + " ");
        }
    }
}
