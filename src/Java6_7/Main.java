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
        if (this.x == o.x){
            return this.y-o.y;
        } else {
            return this.x-o.x;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new Point(x, y));
        }
        Collections.sort(points);
        for (Point point : points){
            System.out.println(point.x + " " + point.y);
        }
    }
}
