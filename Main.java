class PremiumCustomer extends Customer {

    public PremiumCustomer(String name) {
        super(name);
    }

    @Override
    public double getDiscount() {
        return 15;
    }
}

class Payment {

    public void pay(double amount) {
        System.out.println("Payment: $" + amount);
    }
}

class CashPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Cash");
    }
}

public class Main {

    // Method Overloading
    public static double calculateTotal(FoodItem item) {
        return item.getPrice();
    }

    public static double calculateTotal(FoodItem item, int quantity) {
        return item.getPrice() * quantity;
    }

    public static void main(String[] args) {

        FoodItem burger = new FoodItem("Burger", 10);

        // Upcasting
        Customer customer = new PremiumCustomer("Ali");

        burger.displayItem();

        double total = calculateTotal(burger, 2);

        total = total - (total * customer.getDiscount() / 100);

        System.out.println("Discount: " + customer.getDiscount() + "%");

        System.out.println("Final Total: $" + total);

        // Runtime Polymorphism
        Payment payment = new CashPayment();

        payment.pay(total);
    }
}