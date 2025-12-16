package lexicon;

/*
The BankAccount class holds the fields of AccountHolder and Balance.
 */
public class BackAccount {

    private String accountHolder;
    private double balance;

    /*
    This is the constructor method, which assigns the values to the mentioned fields.
     */
    public BackAccount(String accountHolder, double balance) {
        this.setAccountHolder(accountHolder);
        this.setBalance(balance);
    }

    /*
    The getter method of accountHolder used to get the value of the field.
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /*
    The seter method of accountHolder, sets the value based the condition.
     */
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

    /*
    This method used to print the values of the fields.
     */
    public void getBankDetails() {
        System.out.println("AccountHolder: " + getAccountHolder() + " and " +
                "Balance: " + getBalance());
    }
}
