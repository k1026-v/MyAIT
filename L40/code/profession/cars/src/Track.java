public class Track extends Cars{
    String brand;
    int loadWeight;

    public Track(int age, String usege, int speed, String brand, int loadWeight) {
        super(age, usege, speed);
        this.brand = brand;
        this.loadWeight = loadWeight;
    }

    @Override
    public void go() {
        System.out.println("Track with loadWeight ");
        super.go();
    }

    @Override
    public void stop() {
        System.out.print("Track ");
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
