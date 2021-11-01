package payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public int pay(double sum) {
        if(sum < 0)
            return 1;

        System.out.println("Payed with PayPal!");
        return 0;
    }
}
