package Set5;

import java.util.ArrayList;
import java.util.Scanner;

public class IntervalTester {
    // b.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Interval> intervalList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            double l;
            double h;

            do {
                l = (int) (Math.random() * 500);
                h = (int) (Math.random() * 500);
            } while (l > h);

            Interval in = new Interval(l, h);
            intervalList.add(in);
        }

        // System.out.println(intervalList);

        // c.
        System.out.println("Enter an integer (0 - 100)");

        double target;

        do {
            target = input.nextDouble();
        } while (target < 0 || target > 100); // ask for input until in valid range

        // d.
        for (Interval interv : intervalList) {
            if (target > interv.getLow() && target < interv.getHigh()) {
                System.out.println(interv);
            }
        }

    }
}
