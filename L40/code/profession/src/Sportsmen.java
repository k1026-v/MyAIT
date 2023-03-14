public class Sportsmen extends Humen{
    public Sportsmen(String name, String lastName) {
        super(name, lastName);
    }

    public void work() {
        System.out.println("Sportsmen participates in competitions");
        doSport();

    }

    public void doSport(){
        System.out.println("Every day sportsman do sport");
    }
}
