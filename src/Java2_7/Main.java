package Java2_7;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[] result){
        int answer = 0;

        int a = 0;
        for (int i = 0; i < n; i++){
            if (result[i] == 0){
                a = 0;
            } else {
                a++;
                answer += a;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] result = new int[n];
        for (int i = 0; i < n; i++){
            result[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n, result));
    }
}
