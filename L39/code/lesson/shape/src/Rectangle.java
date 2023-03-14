public class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return(a*b);
    }
}
