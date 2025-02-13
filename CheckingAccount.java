public class CheckingAccount extends BankAccount{
    private int FREE_TRANSACTIONS = 3;
    private double TRANSACTION_FEE = 2.0;
    private int transactions;

    public CheckingAccount(double balance){
        super(balance);
        transactions = 0;
    }
}
