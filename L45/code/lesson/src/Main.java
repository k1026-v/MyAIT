import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        House h1= new House(44,600,"Munchen");
        House h2= new House(44,600,"Berlin");
        House h3= new House(64,800,"Munchen");

        TreeSet s1=new TreeSet<>();
        s1.add(h1);
        s1.add(h2);
        s1.add(h3);

        System.out.println(s1);


        System.out.println(h1.compareTo(h2));
        System.out.println(h1.compareTo(h3));




    }
}