import java.util.ArrayList;
import java.util.Date;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

 Books b1= new Books("Kolobok", 2020, 20);
 Books b2= new Books("Repka", 2021, 23);
 Books b3= new Books("Teremok", 2022, 15);
 Books b4= new Books("Morozko", 2020, 20);
 Books b5= new Books("Gusi-lebedy", 2021, 23);

        System.out.println(b1.compareTo(b2));
        System.out.println(b1.compareTo(b3));
        System.out.println(b1.compareTo(b4));


        ArrayList <String> t3= new ArrayList<String>();

        t3.add(String.valueOf(b1));
        t3.add(String.valueOf(b2));
        t3.add(String.valueOf(b3));
        t3.add(String.valueOf(b4));
        t3.add(String.valueOf(b5));


        System.out.println(t3);


    }
}