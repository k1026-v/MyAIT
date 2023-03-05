import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создать список из 5 валют с помошью enum. По выбору пользователя отобразить текущий курс валюты к евро.
        enum currency {
            USD,
            GBP,
            CNY,
            CAD,
            JPY
        }
        List<String> exchangeRates = new ArrayList<>();
        exchangeRates.add("1,06");
        exchangeRates.add("0,88");
        exchangeRates.add("7,32");
        exchangeRates.add("1,44");
        exchangeRates.add("143,19");

        while (true) {
            for (currency myCurrency : currency.values()) {
                System.out.print(myCurrency + "\n");
            }

        System.out.println("Choice number of currency (1, 2, 3, 4 or 5:");
        int choice = readChoice();
        switch (choice) {
            case 1: {
                System.out.println("Курс USD: "+exchangeRates.get (0));
                break;
            }
            case 2: {
               System.out.println(exchangeRates.get (1));
                break;
            }
            case 3: {
                System.out.println(exchangeRates.get (2));
                break;
            }
            case 4: {
                System.out.println(exchangeRates.get (3));
                break;
            }
            case 5: {
               System.out.println(exchangeRates.get (4));
                break;
            }
        }
        System.out.println();
        System.out.println("Хотите продолжить? y/n");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'n') {
        break;}
        else continue;
        }
    }
    public static int readChoice (){
        Scanner sc= new Scanner(System.in);
        int currencyChoise = 0;
      try {
          currencyChoise = sc.nextInt();
      }catch (InputMismatchException e){
          System.out.println("Wrong input");
      }
        return currencyChoise ;

    }



}