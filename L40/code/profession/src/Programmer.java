public class Programmer extends Humen{
    public Programmer(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public void work() {
        System.out.println("Programmer writes program");
        doCode();
    }

    public void doCode(){
        System.out.println("Every day he writes code");

    }
}
