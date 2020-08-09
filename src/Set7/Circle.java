package Set7;

public class Circle {
    private double centerX, centerY;
    private double rad;

    Circle(double centerX, double centerY, double rad) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.rad = rad;
    }

    double getX() {
        return this.centerX;
    }

    double getY() {
        return this.centerY;
    }

    void setX(double x) {
        this.centerX = x;
    }

    void setY(double y) {
        this.centerY = y;
    }

    double getRadius() {
        return this.rad;
    }

    double getArea() {
        return Math.PI * (rad * rad);
    }

    double getCircumference() {
        return 2 * (Math.PI * rad);
    }

    boolean containsOrigin() {
        return (((0 - getX()) * (0 - getX())) + ((0 - getY()) * (0 - getY()))) <= (rad * rad);
    }

    boolean containsPoint(double x, double y) {
        return (((x - getX()) * (x - getX())) + ((y - getY()) * (y - getY()))) <= (rad * rad);
    }

    boolean isLargerThan(Circle other) {
        return this.getRadius() > other.getRadius();
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + "), " + getRadius();
    }

}
