package GroupProject17;

public class Truck extends Car {
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice - carPrice * 10.0 / 100.0;
        } else {
            return carPrice - carPrice * 20.0 / 100.0;
        }
    }
}
