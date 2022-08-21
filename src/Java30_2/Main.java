package Java30_2;

import java.util.Scanner;

public class Main {
    public int solution(int n){
        int answer = 0, cnt = 1;
        n--;

        while (n > 0){
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) answer++;
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
