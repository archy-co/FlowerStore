package user;

import User.Receiver;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ReceiverTest {

    Receiver receiver1;
    Receiver receiver2;

    @Before
    public void setUp() {
        receiver1 = new Receiver();
        receiver2 = new Receiver();
    }

    @Test
    public void update() {
        Assert.assertEquals(0, receiver1.getStatus());
        receiver1.update(3);
        Assert.assertEquals(3, receiver1.getStatus());
        receiver1.update(-1);
        Assert.assertEquals(-1, receiver1.getStatus());
    }

    @Test
    public void getStatus() {
        Assert.assertEquals(0, receiver2.getStatus());
        receiver2.update(1);
        Assert.assertEquals(1, receiver2.getStatus());
    }

    @Test
    public void getId() {
        Assert.assertTrue(receiver1.getId() < 100);
        Assert.assertTrue(receiver2.getId() < 100);
    }
}