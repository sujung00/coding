package Java5_3;

import java.util.Scanner;
import java.util.Stack;

// 2023.06.29
public class Main {
    public int solution(int n, int[][] arr, int m, int[] moves){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < moves.length; i++){
            for (int j = 0; j < n; j++){
                if (arr[j][moves[i]-1] != 0){
                    int tmp = arr[j][moves[i]-1];
                    arr[j][moves[i]-1] = 0;
                    if (!stack.isEmpty() && stack.peek() == tmp){
                        stack.pop();
                        answer+=2;
                    }else stack.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++){
            moves[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n, arr, m, moves));
    }
}
