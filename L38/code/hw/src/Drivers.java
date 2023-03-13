public class Drivers {
    String nameDriver;
    Integer ageDriver;

    @Override
    public String toString() {
        return "Drivers{" +
                "nameDriver='" + nameDriver + '\'' +
                ", ageDriver=" + ageDriver +
                '}';
    }

    public Drivers(String nameDriver, Integer ageDriver) {

        this.nameDriver = nameDriver;

        if (ageDriver<=65 && ageDriver>=21) {
             this.ageDriver = ageDriver;
        } else {
            System.out.println("Age violation");
        }


    }
}
