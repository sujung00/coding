package Java5_3;

import java.util.Scanner;
import java.util.Stack;

// 2023.06.29*
public class Main {
    public int solution(int n, int[][] board, int m, int[] moves){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int pos : moves){
            for (int i = 0; i < n; i++){
                if (board[i][pos] != 0){
                    int tmp = board[i][pos];
                    board[i][pos] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()){
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
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
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++){
            moves[i] = scanner.nextInt()-1;
        }
        System.out.println(T.solution(n, board, m, moves));
    }
}
