public class Main {
    public static void main(String[] args) {


        Bus bus1= new Bus(261, "Fox Taxi", 35, 70, 2);
        System.out.println(bus1.toString());

        bus1.setDriver("Good Driver");
        System.out.println(bus1.toString());

        Drivers driver1=new Drivers("123", 1);
        System.out.println(driver1.toString());

        int money;
        money = bus1.capacity*60/100* bus1.cost*5;

        System.out.println("Earned money - " +money);

    }
}