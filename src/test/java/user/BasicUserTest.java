package user;

import User.BasicUser;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class BasicUserTest {

    BasicUser user1;
    BasicUser user2;

    @Before
    public void setUp() {
        user1 = new BasicUser();
        user2 = new BasicUser(1);
    }

    @Test
    public void getStatus() {
        Assert.assertEquals(0, user1.getStatus());
        user1.update(1);
        Assert.assertEquals(1, user1.getStatus());

        Assert.assertEquals(1, user2.getStatus());
        user2.update(0);
        Assert.assertEquals(0, user2.getStatus());
    }

    @Test
    public void getId() {
        Assert.assertTrue(user1.getId() < 100);
        Assert.assertTrue(user1.getId() > 0);
    }
}