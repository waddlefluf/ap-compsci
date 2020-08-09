package Set7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1.

        // circleRow();
        // circleGrid();

        // 2.

        displayCountingRectangle(4);

        // 3.

        System.out.println(returnRectangle(4, 6, '.'));

        // 4.

        // System.out.println(rollDie());

        // tester for roll2Die()
        /*
        for (int i = 0; i < 100; i++)
            roll2Die();
        */

        // 5.

        Circle c = new Circle(16, 32, 8);
        Circle c2 = new Circle(4, 8, 16);

        System.out.printf("c area:%25f\n", c.getArea());
        System.out.printf("c circumference%17f\n", c.getCircumference());
        System.out.printf("c contains 0,0:%17s\n", c.containsOrigin());
        System.out.printf("c2 contains 0,0:%16s\n", c2.containsOrigin());
        System.out.printf("c contains 14,38:%15s\n", c.containsPoint(14, 38));
        System.out.printf("c larger than c2:%15s\n", c.isLargerThan(c2));
        System.out.printf("c2 larger than c:%15s\n", c2.isLargerThan(c));
        System.out.printf("circle c:%23s\n", c);

        // b.

        Random rand = new Random();

        ArrayList<Circle> circleList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            double randomX = -200 + rand.nextDouble() * (200 - -200);
            double randomY = -200 + rand.nextDouble() * (200 - -200);
            double randomR = Math.random()*100+1;

            Circle circle = new Circle(randomX, randomY, randomR);
            circleList.add(circle);
        }

        for (Circle circle : circleList) {
            if (circle.containsOrigin()) {
                // System.out.println(circle); // c.
            }
        }

        // bonus

        System.out.println("getContainingCircle:\t" + getContainingCircle(circleList));

        // 6.

        String[] arr = {"hi", "hello", "hey", "something", "test", "a"};
        System.out.println("\nrandom pair:\t" + getRandomPair(arr));

        // 7, 8

        int[] nums = {0, 1, 2, 7, 9, 11, 14, 17, 22, 27, 32};
        int[] nums2 = {0, 1, 2, 5, 7, 2, 11, 14, 17, 22, 27, 32};
        System.out.printf("nums increasing:%16s\n", isIncreasingArray(nums));
        System.out.printf("nums2 increasing:%15s\n", isIncreasingArray(nums2));

        System.out.printf("nums sum to 10:%17s\n", neighborsSumTo10(nums));
        System.out.printf("nums2 sum to 10:%16s\n", neighborsSumTo10(nums2));

        // 9.

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        System.out.println("\nCombined Arrays & ArrayLists:");

        System.out.println(combineArrays(a, b));
        System.out.println(Arrays.toString(combineArrayLists(a2, b2)));
    }

    // 1.

    static void circleRow() {
        // a.

        for (int i = 5; i <= 50; i += 5)
            // just printing what it would look like since i'm not using processing
            // ellipse(i, 0, 10, 10);
            System.out.printf("ellipse(%d, 0, 10, 10)\n", i);
    }

    static void circleGrid() {
        // b.

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 30; j += 10) {
                // ellipse(j, 0, 10, 10);
                System.out.printf("ellipse(%d, 0, 10, 10)\n", j);
            }
            System.out.println(); // just to make it look more organized when printing
        }
    }

    // 2.

    static void displayCountingRectangle(int maxNum) {
        // probably should refactor this later, seems kinda messy

        int n = maxNum;

        for (int i = 0; i <= maxNum; i++) {

            for (int j = i; j <= n; j++)
                System.out.print(j + " ");

            for (int k = n-1; k >= i; k--)
                System.out.print(k + " ");

            n++;

            System.out.println();
        }
    }

    // 3.

    static String returnRectangle(int height, int width, char character) {
        String rect = "";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rect += character;
            }
            rect += "\n";
        }

        return rect;
    }

    // 4.

    static int rollDie() {
        // a.

        return (int)(Math.random()*10)+1;
    }

    static void roll2Die() {
        // b.

        int d1, d2;

        // System.out.println("Start"); // for using the tester

        do {
            d1 = rollDie();
            d2 = rollDie();

            System.out.println("d1: " + d1 + "\t" + "d2: " + d2);
        } while (d1 == 10 && d2 == 10);
    }

    // 5. (bonus)

    static Circle getContainingCircle(ArrayList<Circle> arr) {
        for (Circle circle : arr) {
            for (Circle circle1 : arr) {
                if (circle1.containsPoint(circle.getX(), circle.getY()))
                    return circle1;
            }
        }

        return null;
    }

    // 6.

    static String getRandomPair(String[] arr) {
        return arr[(int)(Math.random()*arr.length)] + " " + arr[(int)(Math.random()*arr.length)];
    }

    // 7.

    static boolean isIncreasingArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1])
                return false;
        }

        return true;
    }

    // 8.

    static boolean neighborsSumTo10(int[] arr) {
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i] + arr[i+1] + arr[i+2] == 10)
                return true;
        }

        return false;
    }

    // 9.

    static ArrayList<Integer> combineArrays(int[] a, int[] b) {
        // a.

        ArrayList<Integer> combinedArrays = new ArrayList<>();

        for (int i : a)
            combinedArrays.add(i);

        for (int i : b)
            combinedArrays.add(i);

        return combinedArrays;
    }

    static int[] combineArrayLists(ArrayList<Integer> a, ArrayList<Integer> b) {
        // b.

        int[] combinedArrays = new int[a.size() + b.size()];

        for (int i = 0; i < a.size(); i++)
            combinedArrays[i] = a.get(i);

        for (int i = 0; i < b.size(); i++)
            combinedArrays[i + a.size()] = b.get(i);

        return combinedArrays;
    }

}
