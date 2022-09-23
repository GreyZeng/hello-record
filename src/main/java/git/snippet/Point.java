package git.snippet;
import git.snippet.WithXCoordinate;

public record Point(int x, int y) implements WithXCoordinate {
    private static final int ZERO = 0;
    private static long count = 0;


    public Point() {
        this(ZERO, ZERO);
        synchronized (Point.class) {
            count++;
        }
    }

    public static synchronized long getCount() {
        return count;
    }
    public double distanceTo(Point target) {
        int dx = target.x() - this.x();
        int dy = target.y() - this.y();
        return Math.sqrt(dx *dx + dy* dy);
    }
    // 正确写法
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 错误写法
    //public Point(int m , int n) {
    //    this.x = m;
    //    this.y = n;
    //}
    public Point(int v) {
        this(v, v + 3);
    }
}
// pre jdk 16
//public class Point {
//
//    private final int x;
//    private final int y;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Point point = (Point) o;
//
//        if (x != point.x) return false;
//        return y == point.y;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = x;
//        result = 31 * result + y;
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "Point{" + "x=" + x + ", y=" + y + '}';
//    }
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//}

// use lombok
//@AllArgsConstructor
//@Getter
//@EqualsAndHashCode
//@ToString
//public class Point {
//    private final int x;
//    private final int y;
//}
