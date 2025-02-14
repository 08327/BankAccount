public class CheckingAccount extends BankAccount {
    private int FREE_TRANSACTIONS = 3;
    private double TRANSACTION_FEE = 2.0;
    private int transactions;

    public CheckingAccount(double balance) {
        super(balance);
        transactions = 0;
    }

    // the supper deposit is call deposit from bank account
    public void deposit(double deposit) {
        super.deposit(deposit);
        transactions++;
    }

    // call the super withdraw that from bank account
    //use transaction do get how man times money transfer
    public void withdraw(double withdraw) {
        super.withdraw(withdraw);
        transactions++;
    }

    //if transactions greater than 3, need pay (transaction - 3) * 2.0
    public void deductFees() {
        if (transactions > FREE_TRANSACTIONS) {
            super.withdraw((transactions - FREE_TRANSACTIONS) * TRANSACTION_FEE);
        }
        transactions = 0;
    }

    public String toString() {
        return super.toString() + ", transactions=" + transactions;
    }
}
