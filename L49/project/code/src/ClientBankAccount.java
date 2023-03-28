import java.util.List;
import java.util.Scanner;

public class ClientBankAccount extends Client{
    int AccountNumber;

    public ClientBankAccount(String name, int ID, String numberCard, String pin, int accountNumber) {
        super(name, ID, numberCard, pin);
        AccountNumber = accountNumber;
    }

    public static int refillAccount(List<Integer> account){
        System.out.println("Please, enter a sum:");
        Scanner sc=new Scanner(System.in);
        int balance=account.get(account.size()-1);
        int cash=sc.nextInt();
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
        cash = sc.nextInt();
        if (cash > balance) {
            System.out.println("Not enough money on your card. Please, enter another sum: ");

        } else {
            dif = balance - cash;
            System.out.println("Please,take your many.");
            System.out.println("Please,take your card.");
            }

        return dif;
    }
}
