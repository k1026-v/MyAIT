import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Сравнение объектов класса Human");

        Human peter = new Human("Петр", 200, 78, 27);
        Human daniil = new Human("Даниил", 178, 83, 22);
        Human viktor = new Human("Виктор", 182, 90, 24);
        Human andrei = new Human("Андрей", 165, 45, 18);
        Human yakov = new Human("Яков", 185, 65, 23);
        Human alex = new Human("Алексей", 185, 65, 23);

        List humanList = new ArrayList();

        humanList.add(peter);
        humanList.add(daniil);
        humanList.add(viktor);
        humanList.add(andrei);
        humanList.add(yakov);
        humanList.add(alex);

        Collections.sort(humanList, new HumanByAgeComparator());
        System.out.println("Sorted data according to Human age");
        for (int i=0; i < humanList.size(); i++) {
            System.out.println(humanList.get(i));
        }

        Collections.sort(humanList, new HumanBynWeightComporator());
        System.out.println("Sorted data according to Human weight");
        for (int i=0; i < humanList.size(); i++) {
            System.out.println(humanList.get(i));
        }


        Collections.sort(humanList, new HumanByHeightComporator());
        System.out.println("Sorted data according to Human height");
        for (int i=0; i < humanList.size(); i++) {
            System.out.println(humanList.get(i));
        }
    }
}