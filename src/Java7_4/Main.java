package Java7_4;

// 피보나치 수열
// 1) 피보나치 수열을 출력한다.
// 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
// 2) 입력은 피보나치 수열의 총 항의 수 이다.
// 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

public class Main {
    public int DFS(int n){
        if (n <= 2) return 1;
        else {
            return DFS(n-1) + DFS(n-2);
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        int n = 7;
        for (int i = 1; i <= n; i++){
            System.out.print(T.DFS(i) + " ");
        }
    }
}
