package lexicon;

/*
The Customer class holds the fields of CustomerID, Name and Email.
 */
public class Customer {

    private int customerId;
    private String name;
    private String email;

    public Customer(int customerId, String name) {
        this.setCustomerId(customerId);
        this.setName(name);
        this.setEmail(null);
    }

    public Customer(int customerId, String name, String email) {
        this.setCustomerId(customerId);
        this.setName(name);
        this.setEmail(email);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        if (customerId < 0) {
           // throw new IllegalArgumentException("CustomerId can't be Negative.");
            System.out.println("CustomerId can't be Negative.");
            return;
        }
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name can't be empty/null.");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomerId=" + customerId + ", Name='" + name + '\'' +
                ", Email='" + email + '\'' ;
    }
}
