package Java2_6;

import java.util.ArrayList;
import java.util.Scanner;

// 2023.06.20* => 숫자 뒤집기부분..
public class Main {
    public ArrayList<Integer> solution(int n, int[] numbers){
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int num = numbers[i];
            int res = 0;
            while (num > 0){
                int t = num%10;
                res = res*10 + t;
                num = num/10;
            }
            if (isPrime(res)) answer.add(res);
        }

        return answer;
    }
    public boolean isPrime(int num){
        if (num == 1) return false;
        for (int i = 2; i <= (int)Math.sqrt(num); i++){
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, numbers)){
            System.out.print(x + " ");
        }
    }
}
