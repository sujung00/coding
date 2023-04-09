package Java2_5;

import java.util.Scanner;

public class Main {
    public int solution(int n){
        int answer = 0;

        int[] ch = new int[n+1];
        for (int i = 2; i < ch.length; i++){
            if (ch[i] == 0){
                answer++;
                // i의 배수들의 값을 1로 만든다.
                for (int j = i; j < ch.length; j = j+i){
                    ch[j] = 1;
                }
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
