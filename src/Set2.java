import java.util.Scanner;

public class Set2 {
    public static void main(String[] args) {
        // multiples();
        // guess();
        // functionLoop();
        // nestedLoops();
        // triangle();
        // dice();
        // whileLoops();
        // convertedLoop();
        // drawX(16);
    }

    static void multiples() {
        // #0

        for (int i = 20; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("WONK");
            } else if (i % 2 == 0) {
                System.out.println("*" + i);
            } else if (i % 3 == 0) {
                System.out.println(i + " hi");
            } else {
                System.out.println(i);
            }
        }

    }

    static void guess() {
        // #1

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int n1 = (int) (Math.random() * 20) + 1;
            int n2 = (int) (Math.random() * 20) + 1;

            System.out.print("\nGuess a number (1-20):\t");
            int guess = input.nextInt();

            int max = Math.max(n1, Math.max(n2, guess));
            int min = Math.min(n1, Math.min(n2, guess));
            int mid = n1 + n2 + guess - max - min;

            System.out.print("\n" + min + " " + mid + " " + max);

            if (guess == mid) {
                System.out.print("\t\tWINNER");
            }

        }
    }

    static void codeRewrite() {
        // this isn't an actual method, just answers to one of the problems (other than c.)
       /*
       // a.
        if (n < 0) {
            doSomethingWith(n);
        }

        if (!runTest()) {
            doSomethingWith(n);
        }

        // b.
        method1();
        z = method2(x);

        if (x > 0) {
            x = -x;
        } else {
            x++
        }
        */

        // c.

        int [] a = new int[9];
        a[0] = 30;
        for (int i = 1; i < 9; i++) {
            a[i] = a[i-1]+10;
        }

    }

    static void functionLoop() {
        for (int x = 0; x <= 20; x++) {
            int y = ((2 * (x*x*x)) - x) + 1;
            System.out.printf("x = %d and f(%d) = %d\n", x, x, y);
        }

    }

    static void nestedLoops() {
        // c.
        for (int i = 0; i < 5; i++) {
            for (int j = i-1; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n\n"); // just to give space between the problems

        // d.
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }

            for (int t = 0; t < 4-i; t++) {
                System.out.print("0 ");
            }
            System.out.println();
        }

    }

    static void triangle() {
        Scanner input = new Scanner(System.in);
        int n = 0;

        while (n <= 0) { // while loop to make sure user input isn't 0 or negative
            System.out.print("enter a positive integer: ");
            n = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void dice() {
        int n1, n2, n3 = 0;
        int counter = 0;

        do {
            n1 = (int)(Math.random()*6)+1;
            n2 = (int)(Math.random()*6)+1;
            n3 = (int)(Math.random()*6)+1;

            counter++;

            System.out.printf("%d\t%d\t%d\n", n1, n2, n3);
        } while (!(n1 == 1 && n2 == 1 && n3 == 1));

        System.out.println(counter);

    }

    static void whileLoops() {
        Scanner input = new Scanner(System.in);
        int num = 0;

        // a.
        do {
            System.out.println("type a number (a.):\t");
            num = input.nextInt();
        } while (!(num >= 10 && num <= 15));

        // b.

        do {
            System.out.println("type a number (b.):\t");
            num = input.nextInt();
        } while (!(num >= 10 && num <= 20 && num % 2 == 1));

    }

    static void convertedLoop() {
        int num = 10;

        while (num > 2) {
            System.out.println("Num is: " + num);
            num--;
        }

    }

    static void drawX(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }

}
