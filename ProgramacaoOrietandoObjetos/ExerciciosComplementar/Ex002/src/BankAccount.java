public class BankAccount {
    private int numberAccount;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getNumberAccount() {
        return this.numberAccount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double depositValue) {
        this.balance += depositValue;
    }

    public void draw(double drawValue) {
        this.balance -= drawValue;
    }
}
