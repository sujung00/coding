package Java2_3;

import java.util.Scanner;

// 2023.06.19
public class Main {
    public char RCP(int a, int b){
        //1:가위, 2:바위, 3:보
        if (a == 1){
            if (b == 1) return 'D';
            else if (b == 2) return 'B';
            else if (b == 3) return 'A';
        }
        else if (a == 2){
            if (b == 1) return 'A';
            else if (b == 2) return 'D';
            else if (b == 3) return 'B';
        }
        else if (a == 3){
            if (b == 1) return 'B';
            else if (b == 2) return 'A';
            else if (b == 3) return 'D';
        }

        return ' ';
    }

    public char[] solution(int n, int[] a, int[] b){
        char[] answer = new char[n];

        for (int i = 0; i < n; i++){
            answer[i] = RCP(a[i], b[i]);
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
