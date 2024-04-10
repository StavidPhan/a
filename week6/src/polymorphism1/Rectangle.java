package polymorphism1;

import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double  length;

    /**
     * Constructor 1.
     */
    public Rectangle() {
        super();
        this.width = 0;
        this.length = 0;
    }

    /**
     * Constructor 2.
     */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor 3.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
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
     * return Area.
     */
    public double getArea() {
        return width * length;
    }

    /**
     * return Perimeter.
     */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format(
                "Rectangle[width=%.1f,length=%.1f,color=%s,filled=%s]",
                this.width, this.length,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }
}
