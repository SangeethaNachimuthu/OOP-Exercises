package lexicon;

public class BackAccount {

    private String accountHolder;
    private double balance;

    public BackAccount(String accountHolder, double balance) {
        this.setAccountHolder(accountHolder);
        this.setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder.isEmpty()) {
            //throw new IllegalArgumentException("Account Holder value is empty or null");
            this.accountHolder = "XXX";
        } else {
            this.accountHolder = accountHolder;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            //throw new IllegalArgumentException("Balance can't be negative.");
            this.balance = 0.0;
        } else {
        this.balance = balance;
        }
    }

    public void getBankDetails() {
        System.out.println("AccountHolder: " + getAccountHolder() + " and " +
                "Balance: " + getBalance());
    }
}
