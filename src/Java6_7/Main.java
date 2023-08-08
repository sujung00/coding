package Java6_7;

import java.util.*;

class Point implements Comparable<Point>{
    public int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            // this -> o 순서대로 정렬이 되려면 음수값 리턴
            return this.y-o.y;
        }
        else {
            return this.x-o.x;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point> arr = new ArrayList<Point>();
        for (int i = 0; i < n; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            arr.add(new Point(x, y));
        }
        // 정렬
        // Comparable 인터페이스를 통해서 Point 객체 정렬
        // 정렬의 기준은 compareTo 메소드를 기준으로 함
        Collections.sort(arr);
        for (Point o : arr){
            System.out.println(o.x + " " + o.y);
        }
    }
}
