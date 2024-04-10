package polymorphism1;

import java.util.Objects;

public class Circle extends Shape {
    protected double radius;

    /**
     * Constructor 1.
     */
    public Circle() {
        super();
        this.radius = 0;
    }

    /**
     * Constructor 2.
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Constructor 3.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
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
                "Circle[radius=%.1f,color=%s,filled=%s]",
                this.radius,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }
}
