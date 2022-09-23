package git.snippet;

/**
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2022/9/12
 * @since
 */
public class App {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        int x = p.x();
        int y = p.y();
        System.out.println(x + " " + y);


        Point p2 = new Point(3, 4);
        Point p3 = new Point(7, 5);

        System.out.println(p2.equals(p)); // 输出 true
        System.out.println(p2.equals(p3)); // 输出 false


        Point from = new Point(17, 3);
        Point to = new Point(18, 12);
        double distance = from.distanceTo(to);
        System.out.println(distance);
    }
}
