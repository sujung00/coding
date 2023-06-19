package Java2_3;

import java.util.Scanner;

// 2023.06.19
public class Main {
    public char[] solution(int n, int[] a, int[] b){
        char[] answer = new char[n];

        // 1:가위, 2:바위, 3:보
        // 이긴 사람 정보 저장, 비기면 D
        for (int i = 0; i < n; i++){
            if (a[i] == 1){ // 가위
                switch (b[i]){
                    // 가위
                    case 1:
                        answer[i] = 'D';
                        break;
                    // 바위
                    case 2:
                        answer[i] = 'B';
                        break;
                    // 보
                    case 3:
                        answer[i] = 'A';
                        break;
                }
            }
            else if (a[i] == 2){ // 바위
                switch (b[i]){
                    // 가위
                    case 1:
                        answer[i] = 'A';
                        break;
                    // 바위
                    case 2:
                        answer[i] = 'D';
                        break;
                    // 보
                    case 3: answer[i] = 'B';
                }
            }
            else if (a[i] == 3){ // 보
                switch (b[i]){
                    // 가위
                    case 1:
                        answer[i] = 'B';
                        break;
                    // 바위
                    case 2:
                        answer[i] = 'A';
                        break;
                    // 보
                    case 3:
                        answer[i] = 'D';
                        break;
                }
            }
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
        for (char c : T.solution(n, a, b)){
            System.out.println(c);
        }
    }
}
