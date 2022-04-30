package GroupProject17;

public class Square implements Shape {

    double a;

    public Square() {
    }

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a*a;
    }

    @Override
    public double calculatePerimiter() {
        return a*4;
    }
}
