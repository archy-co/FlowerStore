package flowerstore;

import payment.Payment;

public class Order {
    public Payment paymentStrategy;
    public long orderId;
    public double sumToPay;

    public Order(long orderId, double sum){
        this.orderId = orderId;
        this.sumToPay = sum;
    }

    public Order(long orderId, Payment paymentStrategy, double sum){
        this.orderId = orderId;
        this.paymentStrategy = paymentStrategy;
        this.sumToPay = sum;
    }

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public int pay(){
        return this.paymentStrategy.pay(this.sumToPay);
    }

    public void complete(){
        this.sumToPay = 0;
    }

    public long getOrderId() {
        return orderId;
    }

    public int pay(double summ){
        if(sumToPay < summ)
            return 1;

        this.sumToPay -= summ;
        return this.paymentStrategy.pay(summ);
    }

}
