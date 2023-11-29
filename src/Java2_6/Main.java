package Java2_6;

import java.util.ArrayList;
import java.util.Scanner;

// 2023.06.20* => 숫자 뒤집기부분..
public class Main {
    public boolean isPrime(int n){
        boolean answer = true;

        if (n < 2) return false;
        if (n == 2) return true;
        else if (n == 3) return true;
        else {
            for (int i = 2; i < n; i++){
                if (n%i == 0) return false;
            }
        }

        return answer;
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0){
                int t = tmp % 10;
                res = res*10+t;
                tmp = tmp/10;
            }
            if (isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
