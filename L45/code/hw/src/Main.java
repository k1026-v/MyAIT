import java.util.Date;

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

    }
}