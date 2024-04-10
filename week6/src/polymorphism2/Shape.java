package polymorphism2;

import java.util.Objects;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Constructor 1.
     */
    public Shape() {
        this.color = "";
        this.filled = false;
    }

    /**
     * Constructor 2.
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

    public abstract double getArea();

    public abstract double getPerimeter();

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format(
                "Shape[color=%s,filled=%s]",
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }
}
