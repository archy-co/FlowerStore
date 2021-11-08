package db;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ConnectionTest {

    Connection connection;
    @Before
    public void setUp() {
        connection = Connection.getConnection();
    }

    @Test
    public void getConnection() {
        Connection temp_con = connection;
        Assert.assertTrue(temp_con.equals(connection));
    }

    @Test
    public void getId() {
        Assert.assertTrue(connection.getId() < 100);
    }
}