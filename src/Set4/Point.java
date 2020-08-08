package Set4;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distanceTo(Point other) {
        // distance = √(x1-y1)² + (x2-y2)²
        return Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
    }

    public boolean isRightOf(Point other) {
        return this.x > other.x;    
    }

    public Point getLocationAtPercent(double percent, Point other) {
        double dec = percent / 100;

        return new Point((this.x + other.x) * dec, (this.y + other.y) * dec);

        // might try to go back to full bonus Path problem later
    }

    public String toString() {
        return "(" + x + ", " + y + ")";

    }
}
