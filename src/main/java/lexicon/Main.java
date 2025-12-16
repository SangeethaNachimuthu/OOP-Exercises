package lexicon;

public class Main {

    void main() {

        BackAccount account1 = new BackAccount("John", 1500.00);
        BackAccount account2 = new BackAccount("Lily", -1000);
        BackAccount account3 = new BackAccount("", 5000);
        account1.getBankDetails();
        account2.getBankDetails();
        account3.getBankDetails();
    }
}
