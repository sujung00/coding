package Java5_3;

import java.util.Scanner;
import java.util.Stack;

// 2023.06.29*
public class Main {
    public int solution(int n, int[][] board, int m, int[] moves){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        // 움직이는 횟수만큼
        for (int move : moves){
            for (int i = 0; i < n; i++){
                if (board[i][move] != 0){
                    // 집어 올린 인형은 0으로 바꿔줘야하기 때문에
                    // tmp 변수를 사용한다!
                    int tmp = board[i][move];
                    board[i][move] = 0;

                    // stack이 비어있지 않고 stack의 가장 윗 부분과 집어 올린 인형이 같다면
                    // => 같은 모양의 인형 두 개가 바구니에 연속해서 쌓이게 되면
                    // stack의 가장 윗 부분을 pop하면 두 인형이 터뜨려지는 것과 같다
                    if (!stack.isEmpty() && stack.peek() == tmp){
                        stack.pop();
                        // 2개의 인형이 터트려진다.
                        answer += 2;
                        break;
                    } else {
                        // stack의 가장 윗 부분과 집어 올린 인형이 같지 않다면
                        // 인형 stack에 집어넣기
                        stack.push(tmp);
                        // 인형이 stack에 들어갔다면 반복문 그만 돌리기
                        break;
                    }

                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
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
            // 배열은 0부터 시작하기 때문에 1씩 빼주기!
            moves[i] = scanner.nextInt()-1;
        }

        // 결과 출력
        System.out.println(T.solution(n, board, m, moves));
    }
}
