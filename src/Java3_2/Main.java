package Java3_2;

import java.util.*;

// 2023.06.21
public class Main {
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m){
            if (arr1[p1] == arr2[p2]){
                answer.add(arr1[p1++]);
                p2++;
            }
            else if (arr1[p1] < arr2[p2]) p1++;
            else p2++;
        }


        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++){
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++){
            arr2[i] = scanner.nextInt();
        }

        for (int x : T.solution(n, m, arr1, arr2)){
            System.out.print(x + " ");
        }
    }
}
