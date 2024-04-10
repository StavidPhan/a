package inheritance1;

public class Cylinder extends Circle {
    private double height;

    /**
     * Cylinder constructor 1.
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * Cylinder constructor 2.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Cylinder constructor 3.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * return thể tích.
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    /**
     * return String.
     */
    @Override
    public String toString() {
        return String.format("Cylinder[%s,height=%.1f]",
                super.toString(), height);
    }

    /**
     * get Area of Cylinder.
     */
    @Override
    public double getArea() {
        return 2.0 * PI * getRadius() * (height + getRadius());
    }
}
