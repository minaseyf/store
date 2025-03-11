package Payment;

public class PayPalPayment implements PaymentStrategy {
    String emial;
    public PayPalPayment(String email) {
        this.emial = email;
    }

    public void pay(double amount) {
        System.out.println("amount : " + amount);
        String details = getPaymentDetails();
        System.out.println(details);
    }

    public String getPaymentDetails() {
        return "paypalpayment---> " + "email : " + emial;
    }
}
