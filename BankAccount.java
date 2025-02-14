public class BankAccount{
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double deposit){
        balance += deposit;
    }

    public void withdraw(double withdraw){
        balance -= withdraw;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "balance=" + balance;
    }
}
