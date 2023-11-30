package Java3_2;

import java.util.*;

// 2023.06.21
public class Main {
   public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
       ArrayList<Integer> answer = new ArrayList<>();

       Arrays.sort(a);
       Arrays.sort(b);
       int lt = 0, rt = 0;
       while (lt < n && rt < m){
           if (a[lt] == b[rt]){
               answer.add(a[lt++]);
               rt++;
           } else if (a[lt] > b[rt]){
               rt++;
           } else {
               lt++;
           }
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
