package Set4;

import java.util.ArrayList;
import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        Random random = new Random();

        // 1.
        // b.

        /*Sphere s = new Sphere(10);
        Sphere s2 = new Sphere(20);

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s.volume());
        System.out.println(s2.volume());

        s2.setRadius(16);

        System.out.println(s.isLargerThan(s2));

        s.setRadius(32);

        System.out.println(s.isLargerThan(s2));*/

        // 2.
        // a. (tester)

        Point p1 = new Point(8, 14);
        Point p2 = new Point(7, 27);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println();
        System.out.println("distance: " + p1.distanceTo(p2) + "\n");
        System.out.println("p1 is to the right of p2: " + p1.isRightOf(p2) + "");
        p2.setX(11);
        System.out.println("p1 is to the right of p2: " + p1.isRightOf(p2) + "\n");

        // b.

        ArrayList<Point> pointList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            // add random points to point list
            double rx = random.nextInt((100 - -100) + 1) + -100;
            double ry = random.nextInt((100 - -100) + 1) + -100;

            Point p = new Point(rx, ry);
            pointList.add(p);
        }

        // c. / d.
        Point target = pointList.get(pointList.size() - 1);

        double largest = 0;
        Point largestPoint = new Point(0, 0);

        System.out.println("\nPoints within a distance of 50 of target:");

        for (Point p : pointList) {
            if (p.distanceTo(target) <= 50) {
                System.out.println(p);
            }

            // d.

            if (p.distanceTo(target) > largest) {
                largest = p.distanceTo(target);
                largestPoint = p;
            }

            // might do e. later
        }

        System.out.println("\nPoint furthest from target: " + largestPoint + "" +
                           "\nWith distance of: " + largest);

    }
}
