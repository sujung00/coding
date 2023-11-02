package Java2_6;

import java.util.ArrayList;
import java.util.Scanner;

// 2023.06.20* => 숫자 뒤집기부분..
public class Main {
    public boolean isPrime(int n){
        boolean answer = true;

        if (n < 2) answer = false;
        else {
            for (int i = 2; i < n; i++){
                if (n % i == 0) {
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();


        for (int i = 0; i < n; i++){
            String num = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            int check = Integer.parseInt(num);
            if (isPrime(check)) answer.add(check);
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
