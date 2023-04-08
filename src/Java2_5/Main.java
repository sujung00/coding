package Java2_5;

import java.util.Scanner;

public class Main {
    public int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1]; // index n까지 생성되게 하기 위해서
        //ch[i]가 0이면 소수
        for (int i = 2; i <= n; i++){
            if (ch[i] == 0) {
                answer++;
                // i의 배수는 1로 변경
                // i의 배수 체크 => i의 배수만큼 증가
                for (int j = i; j <= n; j=j+i) ch[j] = 1;
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
