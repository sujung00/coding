package Java7_2;

// 재귀함수를 이용한 이진수 출력
// 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
// 단, 재귀함수를 이용해서 출력해야합니다.

// 입력 : 11
// 출력 : 1011

import java.util.Scanner;

public class Main {
   public void DFS(int n){
       if (n == 0) return;
       else {
           DFS(n/2);
           System.out.print(n%2 + " ");
       }
   }
    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(11);
    }
}
