import java.awt.*;

public class Bus extends Cars {
    String brand;
    int seats;


    public Bus(int age, String usege, int speed, String brand, int seats) {
        super(age, usege, speed);
        this.brand = brand;
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void go() {
        System.out.println("Bus Go with passengers");
        speed= speed;

    }

    @Override
    public void stop() {
        System.out.print("Bus ");
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
