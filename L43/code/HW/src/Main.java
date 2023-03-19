import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

      //    Создать несколько объектов класса Категория.
        // Создать класс Basket, содержащий массив купленных товаров.
        // Создать класс User, содержащий логин, пароль и объект класса Basket
        // Создать несколько объектов класса User
        // Вывести на консоль каталог продуктов.
        // Вывести на консоль покупки посетителей магазина.System.out.println("Hello world!");

       Product dress1= new Product("dress1", 35.00, 5.5);
       Product dress2= new Product("dress1", 45.00, 6.0);
       Product dress3= new Product("dress1", 75.00, 7.5);


        ArrayList <String> dresses= new ArrayList<>();
        dresses.add(dress1.toString());
        dresses.add(dress2.toString());
        dresses.add(dress3.toString());

        Categories c1;
        c1 = new Categories("Dress", dresses);
        System.out.println(c1.toString());

        Product tshirt1= new Product("tshirt1", 35.00, 4.5);
        Product tshirt2= new Product("tshirt2", 25.00, 5.5);
        Product tshirt3= new Product("tshirt3", 15.00, 6.5);


        ArrayList <String> tshirts= new ArrayList<>();
        tshirts.add(dress1.toString());
        tshirts.add(dress2.toString());
        tshirts.add(dress3.toString());

        Categories c2=new Categories("tshirts",tshirts);
        System.out.println(c2.toString());

        Basket ub1= new Basket();
        ub1.add(dress1);
        ub1.add(dress3);
     System.out.println(ub1.toString());
        User u1= new User("kat","123", ub1);
     System.out.println(u1.toString());

        Basket ub2= new Basket();
        User u2= new User("dog", "abd", ub2);


    }
}