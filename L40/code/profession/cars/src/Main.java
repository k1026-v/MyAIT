public class Main {
    public static void main(String[] args) {


        Bus bus=new Bus(3, "passenger", 60,"BMW",36);
        Auto auto=new Auto(1, "go", 70,"Reno", 12);
        Track track=new Track(2, "carry",70, "KIO", 24);

        bus.go();
        bus.speedUp();
        bus.speedDown();
        bus.stop();
        System.out.println();

        auto.go();
        auto.speedUp();
        auto.speedDown();
        auto.stop();
        System.out.println();

        track.go();
        track.speedUp();
        track.speedDown();
        track.stop();
        System.out.println();
    }
}