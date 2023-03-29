import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ClientBankAccount extends Client{
    int AccountNumber;

    public ClientBankAccount(String name, int ID, String numberCard, String pin, int accountNumber) {
        super(name, String.valueOf(ID), numberCard, pin);
        AccountNumber = accountNumber;
    }

    public static int refillAccount(List<Integer> account){
        System.out.println("Please, enter a sum:");
        int cash=0;
        Scanner sc=new Scanner(System.in);
        int balance=account.get(account.size()-1);
        try {
            cash=sc.nextInt();
        } catch (
        InputMismatchException e ) {
        System.out.println("Incorrect input. Pleas, input number ");
       }
        int sum= balance+cash;
        System.out.println("Please,take your card.");
        return sum;
    }

    public static int cashWithdraw(List<Integer> account){
        int balance=account.get(account.size()-1);
        int cash=0;
        int dif=0;
        System.out.println("Please, enter a sum:");
        Scanner sc = new Scanner(System.in);
        try{cash = sc.nextInt();
        } catch (InputMismatchException e ) {
            System.out.println("Incorrect input. Pleas, input number ");
        }
        if (cash > balance) {
            System.out.println("Not enough money on your card. Please, try agan.");
            dif=balance;

        } else {
            dif = balance - cash;
            System.out.println("Please,take your many.");
            System.out.println("Please,take your card.");
            }

        return dif;
    }

    public static int moneyTransfer(List<Integer> account){
        int balance=account.get(account.size()-1);
        int cash=0;
        System.out.println("Please, enter a sum:");
        Scanner sc = new Scanner(System.in);
        try{cash = sc.nextInt();
        } catch (InputMismatchException e ) {
        System.out.println("Incorrect input. Pleas, input number ");
        }
        if (cash > balance) {
            System.out.println("Not enough money on your card. Please, try agan.");
            cash=0;

        } else {
            System.out.println("Successful transaction.");
            System.out.println("Please,take your card.");
        }
        return cash;
    }
}
