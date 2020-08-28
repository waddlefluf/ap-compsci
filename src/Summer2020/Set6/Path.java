package Summer2020.Set6;

import Summer2020.Set4.Point;
import java.util.ArrayList;

public class Path {
    private ArrayList<Point> path = new ArrayList<>();

    void addPoint(int x, int y) {
        path.add(new Point(x, y));
    }

    int size() {
        return path.size();
    }

    double getLength() {
        double length = 0;

        for (int i = 0; i < path.size()-1; i++) {
            Point p1 = path.get(i);
            Point p2 = path.get(i+1);

            length += p1.distanceTo(p2);
        }

        return length;
    }

    Point getPoint(int i) {
        try {
            return path.get(i);
        } catch(IndexOutOfBoundsException e) {
            return null;
        }

    }
}
