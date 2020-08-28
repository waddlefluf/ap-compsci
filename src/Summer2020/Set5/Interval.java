package Summer2020.Set5;

// 3.

public class Interval {
    // a.
    double low;
    double high;

    Interval(double low, double high) {
        this.low = low;
        this.high = high;
    }

    void setLow(double low) {
        this.low = low;
    }

    void setHigh(double high) {
        this.high = high;
    }

    double getLow() {
        return this.low;
    }

    double getHigh() {
        return this.high;
    }

    public String toString() {
        return "low: " + getLow() + "\thigh: " + getHigh();
    }
}
