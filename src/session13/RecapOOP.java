package session13;

interface PaymentMethod {
    void pay(double amount);
}

class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using card");
    }
}


class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using cash");
    }
}


class Order {
    private PaymentMethod paymentMethod;

    public Order(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        paymentMethod.pay(amount);
    }
}


abstract class User {
    protected String name;

    public void Super(){
    }

    public User(String name) {
        this.name = name;
    }

    abstract void getRole();

    final public String getName(){
        return name;
    }
}


class Admin extends User {
    public Admin(String name) {
        super(name);
    }


    @Override
    public void getRole() {
        System.out.println("Admin User");
    }

    public void newFeature(){
        System.out.println("new feature");
    }

//    final method cannot be overridden
//    @Override
//    public String getName(){
//        return name;
//    }

    public static void printSomething(){
        System.out.println("something static");
    }

}

public class RecapOOP {
    public static void main(String[] args) {
        PaymentMethod payment = new CardPayment(); //upcasting
        Order order = new Order(payment);
        order.checkout(50);

        User user = new Admin("Marcel");
        user.getRole();
        String userName = user.getName();
        System.out.println("Name of the user: " + userName);
//        user.newFeature();  Upcasting issue

        Admin admin = new Admin("Marcela");
        System.out.println(admin.getName());
        admin.getRole();
        admin.newFeature();
        Admin.printSomething();
    }
}
