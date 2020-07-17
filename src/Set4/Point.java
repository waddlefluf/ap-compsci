package Set4;

public class Point {
    double x;
    double y;

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

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
