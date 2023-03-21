import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet treeSet=new TreeSet<>();

        treeSet.add("A");
        treeSet.add("April");
        treeSet.add("March");
        treeSet.add("10");
        treeSet.add("11");
        treeSet.add("12");

        treeSet.add("1,2");
        treeSet.add("120");
        treeSet.add("February");
        treeSet.add("120");
        treeSet.add("C");




        System.out.println(treeSet);
    }
}