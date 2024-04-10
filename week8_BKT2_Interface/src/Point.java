import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor 1.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance of two points.
     */
    public double distance(Point other) {
        return sqrt(pow(pointX - other.getPointX(), 2)
                        + pow(pointY - other.getPointY(), 2)
        );
    }

    /**
     * check if two points are same.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point another = (Point) o;
            return Math.abs(pointX - another.getPointX()) <= 0.001
                    && Math.abs(pointY - another.getPointY()) <= 0.001;
        }
        return false;
    }
}
