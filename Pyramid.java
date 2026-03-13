public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return (s * h) / 3.0;
    }

    @Override
    public String toString() {
        return "Pyramid{baseArea=" + s + ", height=" + h + ", volume=" + getVolume() + "}";
    }
}