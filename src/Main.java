import Payment.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer terme = new RegularCustomer("terme");
        PremiumCustomer nima = new PremiumCustomer("nima");
        PremiumCustomer mina = new PremiumCustomer("mina");

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234", "mina");
        PaymentStrategy payPalPayment = new PayPalPayment("user1382@gmail.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("XY15CU141923LV");

        terme.displayCustomerInfo();
        nima.displayCustomerInfo();
        mina.displayCustomerInfo();
        System.out.println();

        terme.makePayment(creditCardPayment, 200.5);
        terme.makePayment(payPalPayment, 600);
        System.out.println();
        mina.makePayment(bitcoinPayment, 480.20);
        mina.makePayment(payPalPayment, 780);
        System.out.println();
        nima.makePayment(bitcoinPayment, 100.5);
        nima.makePayment(payPalPayment, 1000.5);
        System.out.println();

        terme.showPaymentHistory();
        System.out.println();
        mina.showPaymentHistory();
        System.out.println();
        nima.showPaymentHistory();
    }
}