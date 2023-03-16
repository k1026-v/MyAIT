public class BankCard implements Debit, Credit{
    @Override
    public void creditMethod() {
        System.out.println("Add some money to card");
    }

    @Override
    public void debitCredit() {
        System.out.println("Deduct some money from card");

    }
}
