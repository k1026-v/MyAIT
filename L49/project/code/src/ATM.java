import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM extends Bank{

    int AtmNumber;
    String adress;

    public ATM(String name, String iban, int atmNumber, String adress) {
        super(name, iban);
        AtmNumber = atmNumber;
        this.adress = adress;
    }

    public static int readMenueChoice() {
        Scanner sc = new Scanner(System.in);
        int menuChoice = 0;
        try {
            menuChoice = sc.nextInt();
        } catch (InputMismatchException e ) {
            System.out.println("Incorrect input. Pleas, input number");
        }
        return menuChoice;
    }
}
