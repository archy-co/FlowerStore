package payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public int pay(double summ) {
        System.out.println("Payed with PayPal!");
        return 0;
    }
}
