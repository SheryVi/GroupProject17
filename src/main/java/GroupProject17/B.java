package GroupProject17;

public class B extends Marks {

        int a;
        int b;
        int c;
        int d;


        public B(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        @Override
        double getPercentage() {
            return (a+b+c+d)/4.0;
        }
    }

