package inheritance1;

public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14;

    /**
     * Circle constructor 1.
     */
    public Circle() {
        this.radius = 0;
        this.color = "";
    }

    /**
     * Circle constructor 2.
     */
    public Circle(double radius) {
        this.radius = radius;
        this.color = "";
    }

    /**
     * Circle constructor 3.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * get Area of this circle.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * convert to String.
     */
    public String toString() {
        return String.format("Circle[radius=%f,color=%s]", radius, color);
    }
}
