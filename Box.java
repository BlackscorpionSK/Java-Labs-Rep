import java.util.ArrayList;

public class Box extends Shape {
    private double volume;
    private ArrayList<Shape> shapes;

    public Box(double volume) {
        this.volume = volume;
        this.shapes = new ArrayList<>();
    }

    public boolean add(Shape shape) {
        double currentVolume = getCurrentVolume();
        if (currentVolume + shape.getVolume() <= volume) {
            shapes.add(shape);
            return true;
        }
        return false;
    }

    private double getCurrentVolume() {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getVolume();
        }
        return total;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Box{capacity=" + volume + ", used=" + getCurrentVolume() + ", shapes=" + shapes + "}";
    }
}