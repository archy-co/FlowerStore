package payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public int pay(double sum) {
        if(sum < 0)
            return 1;

        System.out.println("Payed with Credit Card!");
        return 0;
    }
}