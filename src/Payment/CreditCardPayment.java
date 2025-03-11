package Payment;

public class CreditCardPayment implements PaymentStrategy{
    String cardNumber;
    String cardHolderName;
    public CreditCardPayment (String cardNumber, String cardHolderName) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("amount : " + amount);
        String details = getPaymentDetails();
        System.out.println(details);
    }

    @Override
    public String getPaymentDetails() {
        return "creditcardpayment---> " + "cardnumber : " + cardNumber + " cardholdername : " + cardHolderName;
    }
}
