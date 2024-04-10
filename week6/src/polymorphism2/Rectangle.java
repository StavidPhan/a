package polymorphism2;

import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * Constructor 1.
     */
    public Rectangle() {
        super();
        this.topLeft = new Point();
        this.width = 0.0;
        this.length = 0.0;
    }

    /**
     * Constructor 2.
     */
    public Rectangle(double width, double length) {
        super();
        this.topLeft = new Point();
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor 3.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = new Point();
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor 4.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * get area.
     */
    public double getArea() {
        return width * length;
    }

    /**
     * get perimeter.
     */
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format(
                "Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%s]",
                this.topLeft.toString(),
                this.width,
                this.length,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }

    /**
     * true if 2 rectangles equal.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle a = (Rectangle) o;
            return Math.abs(this.width - a.getWidth()) <= 0.001
                    && Math.abs(this.length - a.getLength()) <= 0.001
                    && this.topLeft.equals(a.getTopLeft());
        }
        return false;
    }

    /**
     * hashCode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }
}
