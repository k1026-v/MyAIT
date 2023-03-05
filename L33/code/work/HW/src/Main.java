import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Задача 1. Имеется список студентов с их фамилиями (задать внутри программы). Распределить студентов на 2 примерно равных группы (+/- 1 человек) случайным образом.
        String [] studens ={"Bond J.","Jackom D.", "Newman F.", "Korc H.", "Dawidson B.", "Black U.", "Meer P.", "Pulmann I."};
        System.out.println("All students:");

        printArray(studens);

        ArrayList<String> group1= new ArrayList<>();
        ArrayList<String> group2= new ArrayList<>();

        for (int i = 0; i < studens.length; i++) {
            group1.add(studens[i]);
            i++;
            group2.add(studens[i]);
        }

        System.out.println("\n"+"Group 1:");
        printList(group1);
        System.out.println("\n"+"Group 2:");
        printList(group2);

    }

    public static void printArray ( String[] array){
        for (int i = 0; i < array.length; i++) {
            int n=i+1;
            System.out.println(n+". "+array[i]);

        }
    }


    public static void printList ( ArrayList<String> printList){
        for (int i = 0; i < printList.size(); i++) {
            int n=i+1;
            System.out.println(n+". "+printList.get(i));

        }
    }


}