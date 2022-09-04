package Java39;

import java.util.Scanner;
import java.util.Stack;

public class  Main {
    public int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves){
            for (int i = 0; i < board.length; i++){
                if (board[i][pos-1]!=0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()){
                        answer += 2;
                        stack.pop();
                    }
                    else stack.push(tmp);
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
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = scanner.nextInt();
            }
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++){
            b[i] = scanner.nextInt();
        }

        System.out.println(T.solution(a, b));
    }
}
