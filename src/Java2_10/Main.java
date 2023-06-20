package Java2_10;

import java.util.Scanner;

// 2023.06.20
public class Main {
    public int solution(int n, int[][] numbers){
        int answer = 0;

        int[][] grid = new int[n+2][n+2];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                grid[i+1][j+1] = numbers[i][j];
            }
        }
        for (int i = 1; i < n+1; i++){
            for (int j = 1; j < n+1; j++){
                if (grid[i][j] > grid[i-1][j] && grid[i][j] > grid[i+1][j]
                && grid[i][j] > grid[i][j-1] && grid[i][j] > grid[i][j+1]) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] numbers = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                numbers[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, numbers));
    }
}
