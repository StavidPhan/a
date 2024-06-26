package polymorphism1;

import java.util.Objects;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Shape constructor 1.
     */
    public Shape() {
        this.color = "";
        this.filled = false;
    }

    /**
     * Shape constructor 2.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * return Area.
     */
    public abstract double getArea();

    /**
     * return Perimeter.
     */
    public abstract double getPerimeter();

    /**
     * Shape toString.
     */
    public String toString() {
        return String.format(
                "Shape[color=%s,filled=%s]",
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }
}