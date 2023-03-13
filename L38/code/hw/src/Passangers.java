public class Passangers {

    String namePassenger;
    Integer agePassenger;

    public Passangers(String namePassenger, Integer agePassenger) {
        this.namePassenger = namePassenger;
        if (agePassenger>10) {
            this.agePassenger = agePassenger;
        } else {
            System.out.println("Too young");
        }
    }

    @Override
    public String toString() {
        return "Passangers{" +
                "namePassenger='" + namePassenger + '\'' +
                ", agePassenger=" + agePassenger +
                '}';
    }
}
