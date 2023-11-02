package Java2_3;

import java.util.Scanner;

// 2023.06.19
public class Main {
    public char RPS(int a, int b){
        char winner = ' ';

        // 1: 가위
        // 2: 바위
        // 3: 보
        if (a == 1){
            if (b == 1) winner = 'D';
            else if (b == 2) winner = 'B';
            else if (b == 3) winner = 'A';
        } else if (a == 2){
            if (b == 1) winner = 'A';
            else if (b == 2) winner = 'D';
            else if (b == 3) winner = 'B';
        } else if (a == 3){
            if (b == 1) winner = 'B';
            else if (b == 2) winner = 'A';
            else if (b == 3) winner = 'D';
        }

        return winner;
    }
    public char[] solution(int n, int[] a, int[] b){
        char[] answer = new char[n];

        for (int i = 0; i < n; i++){
            answer[i] = RPS(a[i], b[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++){
            b[i] = scanner.nextInt();
        }
        for (char x : T.solution(n, a, b)){
            System.out.println(x);
        }
    }
}
