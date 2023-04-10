package Java2_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++){
            if (n % i == 0) return false;
        }

        return true;
    }
    public ArrayList<Integer> solution(int n, int[] nums){
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int tmp = nums[i];
            int res = 0; //뒤집힌 결과
            while (tmp > 0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)){
                answer.add(res);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, nums)){
            System.out.print(x + " ");
        }
    }
}
