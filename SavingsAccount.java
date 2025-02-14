public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        //use super to get balance from bank account
        super(balance);
        this.interestRate = interestRate;
    }

    // get the total out put with interestRate and Balance
    public void addInterest(){
        deposit(getBalance() * interestRate);
    }

    public String toString() {
        return super.toString() + ", interestRate="+interestRate;
    }
}
