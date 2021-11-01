package payment;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class PayPalPaymentStrategyTest {

    PayPalPaymentStrategy paypalPayment;

    @Before
    public void setUp(){
        paypalPayment = new PayPalPaymentStrategy();
    }

    @Test
    public void general(){
        Assert.assertEquals(0, paypalPayment.pay(100));
        Assert.assertEquals(1, paypalPayment.pay(-100));
    }
}