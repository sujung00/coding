package Java14;

import java.util.Scanner;

public class Main {
    public int solution(int num, int[] h){
        int answer = 1;
        int height = h[0];

        for (int i = 1; i < num; i++){
            if (height < h[i]){
                answer++;
                height = h[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] h = new int[num];

        for (int i =0; i < num; i++){
            h[i] = scanner.nextInt();
        }

        System.out.println(T.solution(num, h));
    }
}
