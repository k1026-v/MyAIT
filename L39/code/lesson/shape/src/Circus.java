public class Circus extends Shape {

        double radius;

    public Circus(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI*radius*radius;
    }
}
