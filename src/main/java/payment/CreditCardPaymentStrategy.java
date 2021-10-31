package payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public int pay(double summ) {
        System.out.println("Payed with Credit Card!");
        return 0;
    }

}
