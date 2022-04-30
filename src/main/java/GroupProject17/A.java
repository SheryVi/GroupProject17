package GroupProject17;

public class A extends Marks {

    int a;
    int b;
    int c;


    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPercentage() {
        return (a+b+c)/3.0;
    }
}
