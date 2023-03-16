public class Vehicle implements Move{
    @Override
    public void moveFast() {
        System.out.println("Fast speed. Move very fast");
    }

    @Override
    public void moveSlow() {
        System.out.println("Slow speed. Move very slowly");

    }
}
