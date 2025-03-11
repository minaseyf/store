package Payment;

public class BitcoinPayment implements PaymentStrategy {
    String walletAddress;
    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public void pay(double amount) {
        System.out.println("amount : " + amount);
        String details = getPaymentDetails();
        System.out.println(details);
    }

    public String getPaymentDetails() {
        return "bitcoinpayment---> " + "walletaddress : " + walletAddress;
    }
}
