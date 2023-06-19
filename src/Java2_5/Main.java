package Java2_5;

import java.util.Scanner;

// 2023.06.19*
public class Main {
    public int solution(int n){
        int answer = 0;
        int[] prismNum = new int[n+1];

        for (int i = 2; i <= n; i++){
            if (prismNum[i] == 0){
                answer++;
                for (int j = i; j <= n; j=j+i) prismNum[j] = 1;
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
