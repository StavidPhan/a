package polymorphism2;

import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    /**
     * Constructor 1.
     */
    public Circle() {
        super();
        this.center = new Point();
        this.radius = 0;
    }

    /**
     * Constructor 2.
     */
    public Circle(double radius) {
        super();
        this.center = new Point();
        this.radius = radius;
    }

    /**
     * Constructor 3.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.center = new Point();
        this.radius = radius;
    }

    /**
     * Constructor 4.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * return Area.
     */
    public double getArea() {
        return 3.1415926535 * radius * radius;
    }

    /**
     * return Perimeter.
     */
    public double getPerimeter() {
        return 2 * 3.1415926535 * radius;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format(
                "Circle[center=%s,radius=%.1f,color=%s,filled=%s]",
                this.center.toString(),
                this.radius,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }

    /**
     * Boolean if 2 circles are equal.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle a = (Circle) o;
            return Math.abs(this.radius - a.getRadius()) <= 0.001
                    && this.center.equals(a.getCenter());
        }
        return false;
    }

    /**
     * hashcode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}