import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /* Варианты: Банкомат Разработайте интерфейс банкомата на Java. Работая над проектом,
    вы должны создать пять классов: для владельца счета, самого счета, транзакции, банка и банкомата
        . После ввода идентификатора и пин-кода пользователи должны получить дост уп к записям о
    каждой транзакции,
    а также получить возможность класть деньги на депозит, снимать средства и делать переводы.*/


//Работа над проектом
        Scanner sc=new Scanner(System.in);
        String path = "C:\\MyAIT\\L49\\project\\code\\src\\";
        String fileName = "numberCard.txt";
        String fileName1 = "pin.txt";

        createFile(path, fileName); // создаем файл
        String data = "100200300400";
        Bank.writeDataInFile(path, fileName, data); // пишем данные в файл
        String d = Bank.readDataFromFile(path, fileName);
        System.out.println("Your cart number:" + '\n' + d);

        createFile(path, fileName1); // создаем файл
        String data1 = "1234";
        Bank.writeDataInFile(path, fileName1, data1); // пишем данные в файл
        String d1 = Bank.readDataFromFile(path, fileName1);
        System.out.println("Your pin:" + '\n' + d1);

        ATM atm1=new ATM("RICH","DE100",1,"Munchen, Große Str., 16");

        List<Integer> bankAccount = new ArrayList<>();
        bankAccount.add(300);
        bankAccount.add(500);
        bankAccount.add(700);

        List<String> bankAccountTransaction = new ArrayList<>();

        int i=0;

//Банкомат
        System.out.println();
        System.out.println(" Welcome to  RICH BANK!\n"+"ATM "+atm1.AtmNumber+" "+atm1.adress);


       while ( i<3) {
           System.out.println("Insert your cart number:");
           String input = readClientInput();
           if (input.equals(d)) {
               System.out.println("Insert your pin:");

           } else System.out.println("Incorrect input. Try agan");

           String input1 = readClientInput();
           if (input1.equals(d1)) {
               System.out.println();
               break;
           } else System.out.println();System.out.println("Incorrect input. Try agan");
       }


        System.out.println("Choice operation");

        enum Menu {
            ACCOUNT_BALANCE,
            CASH_WITHDRAW,
            REFILL_ACCOUNT,
            EXIT,
        }


        // начало раьоты с пользователем
        while (true) {

            for (Menu myMenu : Menu.values()) { // цикл for each - Список, который перебираем, параметр цикла, значения
                System.out.print(myMenu + " | "); // опертор с параметром цикла
            }
            System.out.println();
            System.out.println("Выберите, что надо сделать: нажмите 1, 2, 3 или 4");
            int choice = ATM.readMenueChoice(); // выбор пользователя считаем в методе readMenuChoice
            Menu myMenu = Menu.ACCOUNT_BALANCE; // начальное значение выбора в меню

            switch (choice) {
                case 1: {
                    myMenu = Menu.ACCOUNT_BALANCE;
                    System.out.println("Account balance:"+bankAccount.get(bankAccount.size()-1));
                    //add_task(todoList); // вызов метода, который добавляе задачу в список задач
                    //print_tasks(todoList); // вызов метода, который печатает список задач
                    break;
                }
                case 2: {
                    myMenu = Menu.CASH_WITHDRAW;
                    bankAccount.add(ClientBankAccount.cashWithdraw(bankAccount));
                    System.out.println("Account balance:"+bankAccount.get(bankAccount.size()-1));
                    break;
                }
                case 3: {
                    myMenu = Menu.REFILL_ACCOUNT ;

                    bankAccount.add(ClientBankAccount.refillAccount(bankAccount));
                    System.out.println("Account balance:"+bankAccount.get(bankAccount.size()-1));
                    break;
                }
                case 4: {
                    myMenu = Menu.EXIT;
                    System.out.println("Thanks! See you!");
                    return;
                }
                default:{
                    System.out.println("Введите число 1, 2, 3 или 4");
                }
            }
        }


       // System.out.println("Hello world!");
    }

    private static void createFile(String path, String fileName) {
    }

    public static String readClientInput() {
        Scanner sc = new Scanner(System.in);
        String clientInput=" ";
        try {
            clientInput = sc.nextLine();
        } catch (InputMismatchException e ) {
            System.out.println("Incorrect input. Pleas, input number ");
        }
        return clientInput;
    }

    public static int readClientInput1() {
        Scanner sc = new Scanner(System.in);
        int clientInput=0;
        try {
            clientInput = sc.nextInt();
        } catch (InputMismatchException e ) {
            System.out.println("Incorrect input. Pleas, input number ");
        }
        return clientInput;
    }

}