package polymorphism1;

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

    public double getSide() {
        return this.width;
    }

    /**
     * Set square side.
     */
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
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
                "Square[side=%.1f,color=%s,filled=%s]",
                this.width,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }
}
