package Set6;

import Set4.Point;
import java.util.ArrayList;

public class Path {
    ArrayList<Point> path = new ArrayList<>();

    Path() {
        this.path = path;
    }

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
}
