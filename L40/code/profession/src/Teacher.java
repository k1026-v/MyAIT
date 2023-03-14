public class Teacher extends Humen{
    public Teacher(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public void work() {
        System.out.println("Teacher teaches pupil");
        doLesson();
    }

    public void doLesson(){
        System.out.println("Every day teacher teaches lessons");
    }
}
