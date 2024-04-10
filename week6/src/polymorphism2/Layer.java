package polymorphism2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Layer {
    private List<Shape> shapes;

    /**
     * Constructor 1.
     */
    public Layer() {
        shapes = new ArrayList<>();
    }

    /**
     * add new shape to list.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * remove all circle in list.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * Get info of layer.
     */
    public String getInfo() {
        StringBuilder s = new StringBuilder();
        s.append("Layer of crazy shapes:");
        for (Shape shape : shapes) {
            s.append("\n").append(shape.toString());
        }
        return s.toString();
    }

    /**
     * Remove duplicates from list.
     */
    public void removeDuplicates() {
        LinkedHashSet<Shape> shapeSet = new LinkedHashSet<>(shapes);
        this.shapes = new ArrayList<>(shapeSet);
    }
}