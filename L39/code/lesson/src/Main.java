import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       Twistdancer d1= new Twistdancer("Rici", 23, "m");
       d1.dance();
       Breakdancer d2= new Breakdancer("Fany", 21, "f");
       d2.dance();

        List <Dancer> dancers=new ArrayList<>();
        dancers.add(d1);
        dancers.add(d2);
        System.out.println(dancers);

        for (int i = 0; i <dancers.size(); i++) {

            System.out.println(dancers.get(i));
        }
    }
}