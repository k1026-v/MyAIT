public class Triangel extends Shape{
    double a;
    double h;

    public Triangel(String name, double a, double h) {
        super(name);
        this.a = a;
        this.h = h;
    }

    @Override
    public double square() {
        return (a*h)/2;
    }
}
