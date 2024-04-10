package polymorphism2;

import java.util.Objects;

public class Square extends Rectangle {
    /**
     * Constructor 1.
     */
    public Square() {
        super();
    }

    /**
     * Constructor 2.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructor 3.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Constructor 4.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return this.width;
    }

    /**
     * Set square side 1.
     */
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * Set square side 2.
     */
    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * Set square side 3.
     */
    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format(
                "Square[topLeft=%s,side=%.1f,color=%s,filled=%s]",
                this.topLeft.toString(),
                this.length,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }

    /**
     * true if 2 square equal.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square a = (Square) o;
            return Math.abs(this.width - a.getSide()) <= 0.001
                    && this.topLeft.equals(a.getTopLeft());
        }
        return false;
    }

    /**
     * hashcode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width);
    }
}
