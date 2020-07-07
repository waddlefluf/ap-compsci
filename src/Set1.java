import java.util.Scanner;

public class Set1 {
    public static void main(String[] args) {
        // circleCalc(); // #1
        // System.out.println("\narea: " + triangleArea(200, 450, 382)); // #2

        /*
        //# 3
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature:");
        double t = input.nextDouble();
        System.out.println("Enter wind speed:");
        double w = input.nextDouble();
        double result = calcWindChill(t, w);
        System.out.println("\n\nTemperature:\t" + t + "\nWind Speed:\t\t" + w + "\n\nWind Chill:\t\t" + result);
        */

        // dice(); #4


    }

    static void circleCalc() {
        Scanner input = new Scanner(System.in);

        double rad;
        double cir;
        double area;

        System.out.println("Enter radius:");
        rad = input.nextDouble();

        cir = (2*Math.PI) * rad; // c = 2πr
        area = Math.PI * (rad*rad); // a = πr²

        System.out.println("Circumference:\t" + cir + "\nArea:\t" + area);

    }

    static double triangleArea(double a, double b, double c) {
        // area = √s(s-a)(s-b)(s-c)
        // s = (a+b+c)/2

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * ((s - a) * (s - b) * (s - c)));

        return area;
    }

    static double calcWindChill(double temp, double windSpeed) {
        double windChill = ((35.74 + 0.6215) * temp) + (((0.4275 * temp) - 35.75) * windSpeed);

        return windChill;
    }

    static void dice() {
        for (int i = 1; i < 20; i++) {
            int d1 = (int) (Math.random() * 6) + 1;
            int d2 = (int) (Math.random() * 6) + 1;

            int sum = d1 + d2;

            System.out.println("Die 1: " + d1 + "\tDie 2: " + d2 + "\tSum:" + sum);
        }

    }

}
