public class Twistdancer extends Dancer{

    public Twistdancer(String name, Integer age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void dance() {
         System.out.println(toString()+"dancing twist");

    }
}
