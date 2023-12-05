package Java4_3;

import java.util.HashMap;
import java.util.Scanner;

// 2023.06.25*
public class Main {
    public int[] solution(int n, int k, int[] arr){
        int[] answer = new int[n-k+1];

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < k; i++){
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
            answer[0] = hashMap.size();
        }
        for (int i = k; i < n; i++){
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
            hashMap.put(arr[i-k], hashMap.get(arr[i-k])-1);
            if (hashMap.get(arr[i-k]) == 0) hashMap.remove(arr[i-k]);
            answer[i-k+1] = hashMap.size();
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, k, arr)){
            System.out.print(x + " ");
        }
    }
}
