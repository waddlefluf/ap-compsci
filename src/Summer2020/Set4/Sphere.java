package Summer2020.Set4;

public class Sphere {
    // 1.
    // a.

    double rad;

    Sphere(double r) {
        this.rad = r;
    }

    double getRadius() {
        return this.rad;
    }

    void setRadius(double newRad) {
        this.rad = newRad;
    }

    double volume() {
        return ((rad*rad*rad)*Math.PI) * 4/3;
    }

    boolean isLargerThan(Sphere s) {
        return this.volume() > s.volume();
    }

    public String toString() {
        return "radius: " + rad;
    }
}
