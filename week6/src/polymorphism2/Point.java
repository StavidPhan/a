package polymorphism2;

import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor 1.
     */
    public Point() {
        pointX = 0.0;
        pointY = 0.0;
    }

    /**
     * Constructor 2.
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
     * calculate distance between thisPoint and newPoint.
     */
    public double distance(Point newPoint) {
        if (newPoint != null) {
            return Math.sqrt((pointX - newPoint.getPointX())
                    * (pointX - newPoint.getPointX())
                    + (pointY - newPoint.getPointY())
                    * (pointY - newPoint.getPointY()));
        } else {
            return Math.sqrt(pointX * pointX + pointY * pointY);
        }
    }

    /**
     * Boolean if two points are equal.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point a = (Point) o;
            return Math.abs(this.pointX - a.getPointX()) <= 0.001
                    && Math.abs(this.pointY - a.getPointY()) <= 0.001;
        }
        return false;
    }

    /**
     * hashcode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format("(%.1f,%.1f)", pointX, pointY);
    }
}
