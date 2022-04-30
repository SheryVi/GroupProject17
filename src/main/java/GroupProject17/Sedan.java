package GroupProject17;

public class Sedan extends Car{
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if(length> 20){
            return carPrice-carPrice*5.0/100.0;
        }else {
            return carPrice-carPrice*10.0/100.0;
        }
    }
}
