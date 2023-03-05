import java.util.*;

public class Main {
    public static void main(String[] args) {
        //создать лист дел
        enum menu {
            ADD,
            PRINT,
            DELETE,
            EXIT,
        }
        List<String> todoList = new ArrayList<>();
        while (true){
        for (menu myMenu : menu.values()) {
            System.out.print(myMenu + "\n");

        }
        System.out.println("Choice what to do: 1, 2, 3 or 4:");
        int choice = readMenuChoice();
        menu myMenu = menu.ADD;

        switch (choice) {
            case 1: {
                myMenu = menu.ADD;
                addTask(todoList);
                PrintTask(todoList);
                break;
            }

            case 2: {
                myMenu = menu.PRINT;
                PrintTask(todoList);
                break;
            }

            case 3: {
                taskRemove(todoList);
                PrintTask(todoList);
                break;
            }

            case 4: {
                myMenu = menu.DELETE;
                System.out.println("See you!");

            }
        }

        }


    }
    //Method which read customer choice
    public static int readMenuChoice (){
        Scanner sc= new Scanner(System.in);
        int menuChoise= sc.nextInt();
        return menuChoise;

    }

    //Method_ which add task to todoList
    public static void addTask (List<String> Task){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter task");
        String task= sc.nextLine();
        Task.add(task);
    }

    public static void PrintTask (List<String> Task){
        for (int i = 0; i < Task.size(); i++) {
        int n=i+1;
         System.out.println(n+". "+Task.get(i));
         if (Task.size()==0){
             System.out.println("No task for today");
         }

        }

    }
    public static  void taskRemove (List<String> Task){
        System.out.println("Choice number of task:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int task=n-1;
        Task.remove(task);
    }

}