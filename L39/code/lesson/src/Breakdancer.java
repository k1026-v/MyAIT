public class Breakdancer extends Dancer {
    public Breakdancer(String name, Integer age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void dance() {
        System.out.println(toString()+"dancing break-dance");
    }
}
