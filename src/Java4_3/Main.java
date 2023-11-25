package Java4_3;

import java.util.HashMap;
import java.util.Scanner;

// 2023.06.25*
public class Main {
    public int[] solution(int n, int k, int[] arr){
        int[] answer = new int[k];

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n-k+1; i++){
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
            hashMap.put(arr[i+1], hashMap.getOrDefault(arr[i+1], 0)+1);
            hashMap.put(arr[i+2], hashMap.getOrDefault(arr[i+2], 0)+1);
            hashMap.put(arr[i+3], hashMap.getOrDefault(arr[i+3], 0)+1);

            answer[i] = hashMap.size();

            hashMap.clear();
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
