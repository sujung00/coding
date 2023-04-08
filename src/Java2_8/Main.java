package Java2_8;

import java.util.Scanner;

//등수구하기*
public class Main {
    public int[] solution(int n, int[] nums) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++){
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (nums[j] > nums[i]) cnt++;
            }
            answer[i] = cnt;
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
