package Java2_3;

import java.util.Scanner;

// 1:가위, 2:바위, 3:보
public class Main {
    public char[] solution(int num, int[] a, int[] b){
        char[] answer = new char[num];

        for (int i = 0; i < num; i++){
            if (a[i] == 1 && b[i] == 2) answer[i] = 'B';
            else if (a[i] == 1 && b[i] == 3) answer[i] = 'A';
            else if (a[i] == 2 && b[i] == 1) answer[i] = 'A';
            else if (a[i] == 2 && b[i] == 3) answer[i] = 'B';
            else if (a[i] == 3 && b[i] == 1) answer[i] = 'B';
            else if (a[i] == 3 && b[i] == 2) answer[i] = 'A';
            else answer[i] = 'D';
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] a = new int[num];
        int[] b = new int[num];

        for (int i = 0; i < num; i++){
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++){
            b[i] = scanner.nextInt();
        }

        for (char x : T.solution(num, a, b)){
            System.out.println(x);
        }
    }
}
