package GroupProject17;

public class Task3 {
    /*
    2.Create a Class Car that would have the following
fields:   carPrice   and   color   and   method
calculateSalePrice() which should be returning a price
of the car.

Create 2 sub classes: Sedan and Truck. The Truck
class   has   field   as   weight   and   has   its   own
implementation   of   calculateSalePrice()   method   in
which   returned   price   calculated   as   following:   if
weight>2000 then returned price car should include
10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it
is   own   implementation   of   calculateSalePrice():   if
length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount

Создайте автомобиль класса, который будет иметь следующее
поля: carPrice и color и method
calculateSalePrice(), который должен возвращать цену
из машины.

Создайте 2 подкласса: седан и грузовик. Грузовик
класс имеет поле как вес и имеет свой собственный
реализация метода calculateSalePrice() в
который возвращает цену, рассчитанную следующим образом: если
вес> 2000, тогда возвращаемая цена автомобиля должна включать
Скидка 10%, иначе скидка 20%.
Класс Sedan имеет поле как длину, а также делает это
является собственной реализацией calculateSalePrice(): если
длина седана > 20 футов, тогда цена возвращаемого автомобиля
должна включать скидку 5%, иначе скидка 10%

     */
    public static void main(String[] args) {
        Car obj = new Car(450.0, "black");
        System.out.println(obj.calculateSalePrice());

        Truck obj2 = new Truck(400.0, "black", 1000.0);
        System.out.println(obj2.calculateSalePrice());

        Sedan obj1 = new Sedan(450.0,"yellow",1500);
        System.out.println(obj1.calculateSalePrice());
    }
}
