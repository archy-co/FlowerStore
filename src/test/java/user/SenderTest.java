package user;

import User.Sender;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class SenderTest {

    Sender sender1;
    Sender sender2;

    @Before
    public void setUp() {
        sender1 = new Sender();
        sender2 = new Sender();
    }

    @Test
    public void update() {
        Assert.assertEquals(1, sender1.getStatus());
        sender1.update(3);
        Assert.assertEquals(3, sender1.getStatus());
    }

    @Test
    public void getStatus() {
        Assert.assertEquals(1, sender2.getStatus());
        sender2.update(0);
        Assert.assertEquals(0, sender2.getStatus());
    }

    @Test
    public void getId() {
        Assert.assertTrue(sender1.getId() < 100);
        Assert.assertTrue(sender2.getId() < 100);
    }
}