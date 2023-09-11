package Java7_1;

// 재귀함수
// 자연수 N이 입력되면 재귀함수를 이용하여
// 1부터 N까지를 출력하는 프로그램을 작성하시오.

// 입력 : 3
// 출력 : 1 2 3

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public void DFS(int n){
        if (n == 0) return; // 종결
        else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(3);
    }
}
