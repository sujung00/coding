package Java2_7;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[] nums) {
        int answer = 0;
        int ch = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0){
                ch = 0;
            } else if (nums[i] == 1){
                ch++;
                answer += ch;
            }
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
        System.out.println(T.solution(n, nums));
    }
}
