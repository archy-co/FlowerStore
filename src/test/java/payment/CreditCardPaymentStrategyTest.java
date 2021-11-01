package payment;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CreditCardPaymentStrategyTest {

    CreditCardPaymentStrategy creditCardPayment;

    @Before
    public void setUp(){
        creditCardPayment = new CreditCardPaymentStrategy();
    }

    @Test
    public void general(){
        Assert.assertEquals(0, creditCardPayment.pay(100));
        Assert.assertEquals(1, creditCardPayment.pay(-100));
    }
}