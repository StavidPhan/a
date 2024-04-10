import static java.lang.Math.sqrt;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Constructor 1.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1 == null || p2 == null || p3 == null
                || isSamePoint(p1, p2)
                || isSamePoint(p2, p3)
                || isSamePoint(p1, p3)
                || isStraight(p1, p2, p3)
        ) {
            throw new RuntimeException();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * check if two point is same.
     */
    private boolean isSamePoint(Point p1, Point p2) {
        return p1.equals(p2);
    }

    /**
     * check if three point is straight.
     */
    private boolean isStraight(Point p1, Point p2, Point p3) {
        return (p1.getPointX() - p2.getPointX()) / (p1.getPointY() - p2.getPointY())
                ==
                (p2.getPointX() - p3.getPointX()) / (p2.getPointY() - p3.getPointY());
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * getArea.
     */
    @Override
    public double getArea() {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);
        double p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * getPerimeter.
     */
    @Override
    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);
        return a + b + c;
    }

    /**
     * getInfo.
     */
    @Override
    public String getInfo() {
        return String.format(
                "Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]",
                p1.getPointX(), p1.getPointY(),
                p2.getPointX(), p2.getPointY(),
                p3.getPointX(), p3.getPointY()
        );
    }
}
