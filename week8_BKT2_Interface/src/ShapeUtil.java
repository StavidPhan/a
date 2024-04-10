import java.util.List;

public class ShapeUtil {
    /**
     * print information.
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder circleInfo = new StringBuilder("Circle:\n");
        StringBuilder triangleInfo = new StringBuilder("Triangle:\n");

        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                circleInfo.append(shape.getInfo()).append("\n");
            } else if (shape instanceof Triangle) {
                triangleInfo.append(shape.getInfo()).append("\n");
            }
        }

        return circleInfo.toString() + triangleInfo.toString();
    }
}
