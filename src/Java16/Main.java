package Java16;

import java.util.Scanner;

public class Main {
    public int[] solution (int num){
        int[] answer = new int[num];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < num; i++){
            answer[i] = answer[i-1] + answer[i-2];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int x : T.solution(num)){
            System.out.print(x + " ");
        }
    }
}
