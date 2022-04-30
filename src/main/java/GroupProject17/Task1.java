package GroupProject17;

public class Task1 {
    /*
    Group Exercise #2

After Java OOPs:
Must complete tasks as a group
PART 1: CODING

1.Create an Interface 'Shape' with undefined methods
as calculateArea and calculatePerimiter. Create 2
classes Circle & Square that implements functionality
defined in the Shape Interface. Test your code.
     */
    public static void main(String[] args) {
        Circle obj = new Circle(5.5);

        System.out.println(obj.calculateArea());
        System.out.println(obj.calculatePerimiter());

        Square obj1 = new Square(7.5);

        System.out.println(obj1.calculateArea());
        System.out.println(obj1.calculatePerimiter());
    }

}
