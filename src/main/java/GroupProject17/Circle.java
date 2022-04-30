package GroupProject17;

public class Circle implements Shape {
    double r;

    static final double PI = Math.PI;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return PI * r * r;
    }

    @Override
    public double calculatePerimiter() {
        return 2 * PI * r;
    }

}
