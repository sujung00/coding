package Java5_3;

import java.util.Scanner;
import java.util.Stack;

// 2023.06.29*
public class Main {
    public int solution(int n, int[][] board, int m, int[] moves){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int move : moves){
            for (int i = 1; i <= n; i++){
                if (board[i][move] != 0){
                    if (!stack.isEmpty() && stack.peek() == board[i][move]){
                        stack.pop();
                        answer += 2;
                    }else {
                        stack.add(board[i][move]);
                    }
                    board[i][move] = 0;
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
        int[][] board = new int[n+1][n+1];
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                board[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++){
            moves[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n, board, m, moves));
    }
}
