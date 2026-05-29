public class Customer {

    protected String name;

    public Customer(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return 0;
    }

    public void displayCustomer() {
        System.out.println("Customer: " + name);
    }
}