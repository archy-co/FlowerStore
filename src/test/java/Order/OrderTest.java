package Order;

import User.User;
import User.Sender;
import User.Receiver;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class OrderTest {

    Order order1;
    Sender user1;
    Receiver user2;

    @Before
    public void setUp() {
        order1 = new Order();
        user1 = new Sender();
        user2 = new Receiver();
    }

    @Test
    public void addUser() {
        Assert.assertEquals(0, order1.users.size());
        Assert.assertEquals(0, order1.addUser(user1));
        Assert.assertEquals(1, order1.users.size());
        Assert.assertEquals(0, order1.addUser(user2));
        Assert.assertEquals(2, order1.users.size());
        Assert.assertEquals(1, order1.addUser(user2));
    }

    @Test
    public void removeUser() {
        Assert.assertEquals(0, order1.users.size());
        order1.addUser(user1);
        Assert.assertEquals(0, order1.addUser(user2));
        Assert.assertEquals(2, order1.users.size());

        Assert.assertEquals(0, order1.removeUser(user1));
        Assert.assertEquals(1, order1.removeUser(user1));
        Assert.assertEquals(1, order1.users.size());
    }

    @Test
    public void notifyUsers() {
        order1.addUser(user1);
        Assert.assertEquals(1, user1.getStatus());
        Assert.assertEquals(0, user2.getStatus());
        order1.notifyUsers();
        Assert.assertEquals(2, user1.getStatus());
        Assert.assertEquals(0, user2.getStatus());

        order1.addUser(user2);
        order1.notifyUsers();
        Assert.assertEquals(2, user1.getStatus());
        Assert.assertEquals(2, user2.getStatus());
    }

    @Test
    public void order() {
        order1.addUser(user1);
        Assert.assertEquals(1, user1.getStatus());
        Assert.assertEquals(0, user2.getStatus());
        order1.order();
        Assert.assertEquals(2, user1.getStatus());
        Assert.assertEquals(0, user2.getStatus());

        order1.addUser(user2);
        order1.order();
        Assert.assertEquals(2, user1.getStatus());
        Assert.assertEquals(2, user2.getStatus());
    }

    @Test
    public void createQuickOrder() {
        Order order_temp = order1.createQuickOrder();
        Assert.assertEquals(order_temp.getClass(), QuickOrder.class);
    }
}