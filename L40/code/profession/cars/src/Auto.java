public class Auto extends Cars{
    String brand;
    int capacity;

    public Auto(int age, String usege, int speed, String brand, int capacity) {
        super(age, usege, speed);
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public void go() {
        System.out.println("auto with family");
        super.go();
    }

    @Override
    public void stop() {
        System.out.print("Auto ");
        super.stop();
    }

    @Override
    public void speedUp() {
        super.speedUp();
    }

    @Override
    public void speedDown() {
        super.speedDown();
    }
}
