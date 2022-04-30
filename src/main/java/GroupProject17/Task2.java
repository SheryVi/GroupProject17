package GroupProject17;

/*
    1.We have to calculate the average of marks obtained
in three subjects by student A and by student B.
Create   class   'Marks'   with   an   abstract   method
'getPercentage' that will be returning the average
percentage   of   marks.   Provide   implementation   of
abstract   method   in   classes   'A'   and   'B'.   The
constructor of student A takes the marks in three
subjects as its parameters and the marks in four
subjects as its parameters for student B. Test your
code

     */

public class Task2 {

    public static void main(String[] args) {
        A obj = new A(3,4,5);
        System.out.println(obj.getPercentage());

        B obj1 = new B(4,4,5,5);
        System.out.println(obj1.getPercentage());
    }
    public abstract class Marks {

        abstract double getPercentage();
    }
}
