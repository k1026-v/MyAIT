public class Trapeziod extends Shape{
    double a;
    double b;
    double h;

    public Trapeziod(String name, double a, double b, double h) {
        super(name);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double square() {
        return (a+b)/2*h;
    }
}
