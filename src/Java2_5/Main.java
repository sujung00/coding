package Java2_5;

import java.util.Scanner;

public class Main {
    public int solution(int n){
        int answer = 0;

        for (int i = 2; i < n/2; i++){
            for (int j = 2; j < i; j++){
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(T.solution(n));
    }
}
