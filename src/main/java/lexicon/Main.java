package lexicon;

public class Main {

    void main() {

        /* Exercise - 1
        Created three objects of BankAccount class and
        assigned values to the fields and printed them.
         */
        System.out.println("Bank Account Details: ");
        System.out.println("======================");
        BackAccount account1 = new BackAccount("John", 1500.00);
        BackAccount account2 = new BackAccount("Lily", -1000);
        BackAccount account3 = new BackAccount("", 5000);
        account1.getBankDetails();
        account2.getBankDetails();
        account3.getBankDetails();
        System.out.println();

        /* Exercise - 2
        Created three objects of Customer class and
        assigned values to the fields and printed them.
         */
        System.out.println("Customer Details: ");
        System.out.println("===================");
        Customer customer1 = new Customer(100, "Sang");
        Customer customer2 = new Customer(101, "Aadhi", "aathi@gmail.com");
        Customer customer3 = new Customer(102, "Ann");
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());
        System.out.println();

         /* Exercise - 3
        Created three objects of Student class and
        assigned values to the fields and printed them.
         */
        System.out.println("Student Details: ");
        System.out.println("================");
        Student lily = new Student("Lily", 18, "ECE");
        Student rosy = new Student("Rosy", 19, "EEE");
        Student daisy = new Student("Daisy", 20);
        lily.getStudentInfo();
        rosy.getStudentInfo();
        daisy.getStudentInfo();
        System.out.println();

         /* Exercise - 4
        Created three objects of Product class and
        assigned values to the fields and printed them.
         */
        System.out.println("Product Details: ");
        System.out.println("================");
        Product fan = new Product(1001, "Bosch Fan", 800);
        Product table = new Product(2004, "Dinning Table", 4800);
        Product pot = new Product(105, "Plastic Pot", 45);
        System.out.println(fan.toString());
        System.out.println(table.toString());
        System.out.println(pot.toString());
        System.out.println();

        /* Exercise - 4
        Created an object of Order class and called their methods to perform operations.
        One order has many products.
         */
        Order order1 = new Order();
        order1.addProduct(fan);
        order1.addProduct(table);
        order1.addProduct(pot);
        System.out.println(order1.toString());
        order1.calculateTotal();
        order1.removeProduct(table);
        System.out.println(order1.toString());
        order1.calculateTotal();

        Order order2 = new Order();
        Product saucePan = new Product(104, "SaucePan", 425);
        Product fryingPan = new Product(124, "FryingPan", 560);
        Product jar = new Product(188, "GlassJar", 65);
        order2.addProduct(saucePan);
        order2.addProduct(fryingPan);
        order2.addProduct(jar);
        System.out.println(order2.toString());
        order2.calculateTotal();
    }
}
