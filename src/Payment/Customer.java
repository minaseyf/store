package Payment;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;
    public Customer(String name) {
        this.name = name;
        paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        String detail = amount + " paid" + "\n" + paymentStrategy.getPaymentDetails();
        paymentHistory.add(detail);
    }

    public void showPaymentHistory() {
        System.out.println("paymenthistory for " + name + " : ");
        for(String paymenthistory : paymentHistory){
            System.out.println(paymenthistory);
        }
    }
}
