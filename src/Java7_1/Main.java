package Java7_1;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public void DFS(int n){
        if (n == 0) return;
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
