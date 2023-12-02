package Java3_5;

import java.util.Scanner;

// 2023.06.23*
public class Main {
    public int solution(int n){
        int answer = 0;

        int lt = 0, sum = 0;
        for (int rt = 0; rt < n; rt++){
            sum += rt;
            while (sum >= n){
                if (sum == n) {
                    answer++;
                    break;
                }
                else {
                    sum -= lt++;
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
