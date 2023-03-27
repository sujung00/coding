package Java2_3;

import java.util.ArrayList;
import java.util.Scanner;

// 1:가위, 2:바위, 3:보
public class Main {
    public ArrayList<Character> solution(int[] a, int[] b) {
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < a.length; i++){
            if (a[i] == b[i]) {
                answer.add('D');
                continue;
            }
            if (a[i] == 1){
                if (b[i] == 2) answer.add('B');
                else if (b[i] == 3) answer.add('A');
            } else if (a[i] == 2) {
                if (b[i] == 1) answer.add('A');
                else if (b[i] == 3) answer.add('B');
            } else if (a[i] == 3) {
                if (b[i] == 1) answer.add('B');
                else if (b[i] == 2) answer.add('A');
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
        for (char result : T.solution(a, b)) {
            System.out.println(result);
        }
    }
}
