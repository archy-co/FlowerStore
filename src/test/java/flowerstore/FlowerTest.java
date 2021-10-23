package flowerstore;

import flowerstore.Flower;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlowerTest {

    private Flower flower1;
    private int [] white = {255, 255, 255};
    private int [] violet = {255, 0, 255};

    @Before
    public void init(){
        flower1 = new Flower(9.75, 25.5, white);
    }

    @Test
    public void getPrice() {
        Assert.assertEquals(flower1.getPrice(), 25.5, 0.01);
        flower1.setPrice(22.25);
        Assert.assertEquals(flower1.getPrice(), 22.25, 0.01);
    }

    @Test
    public void testToString() {
        Assert.assertEquals(flower1.toString(), "Flower{sepalLength=9.75, price=25.5, color=[255, 255, 255]}");
        flower1.setPrice(35.85);
        Assert.assertEquals(flower1.toString(), "Flower{sepalLength=9.75, price=35.85, color=[255, 255, 255]}");
        flower1.setColor(violet);
        Assert.assertEquals(flower1.toString(), "Flower{sepalLength=9.75, price=35.85, color=[255, 0, 255]}");
    }

    @Test
    public void getColors() {
        Assert.assertEquals(flower1.getColor()[0], white[0]);
        Assert.assertEquals(flower1.getColor()[1], white[1]);
        Assert.assertEquals(flower1.getColor()[2], white[2]);
    }

    @Test
    public void setColors() {
        flower1.setColor(violet);
        Assert.assertEquals(flower1.getColor()[0], violet[0]);
        Assert.assertEquals(flower1.getColor()[1], violet[1]);
        Assert.assertEquals(flower1.getColor()[2], violet[2]);
        violet[2] = 244;
        Assert.assertEquals(flower1.getColor()[2], 255);
    }

    @Test
    public void getSepalLength() {
        Assert.assertEquals(flower1.getSepalLength(), 9.75, 0.01);
    }
}