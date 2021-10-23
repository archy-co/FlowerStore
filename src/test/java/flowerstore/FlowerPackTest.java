package flowerstore;

import flowerstore.Flower;
import flowerstore.FlowerPack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlowerPackTest {

    private Flower tulip;
    private Flower rose;
    private Flower chamomile;

    private FlowerPack tulipPack;
    private FlowerPack rosePack;

    private int [] white = {255, 255, 255};
    private int [] violet = {255, 0, 255};
    private int [] red = {255, 0, 0};

    @Before
    public void setUp() {
        chamomile = new Chamomile(9.75, 25.5, white);
        tulip = new Tulip(22.0, 40.0, violet);
        rose = new Rose(21.5, 35.0, red);

        tulipPack = new FlowerPack(tulip,4);
        rosePack = new FlowerPack(rose, 5);
    }

    @Test
    public void setAmount() {
        Assert.assertEquals(4, tulipPack.getAmount());
        tulipPack.setAmount(3);
        Assert.assertEquals(3, tulipPack.getAmount());
        tulipPack.setAmount(0);
        Assert.assertEquals(0, tulipPack.getAmount());
        tulipPack.setAmount(-5);
        Assert.assertEquals(0, tulipPack.getAmount());
    }

    @Test
    public void getPrice() {
        Assert.assertEquals(4, tulipPack.getAmount());
        Assert.assertEquals(160.0, tulipPack.getPrice(), 0.01);
        tulipPack.setAmount(3);
        Assert.assertEquals(120.0, tulipPack.getPrice(), 0.01);

        Assert.assertEquals(175.0, rosePack.getPrice(), 0.01);
        rosePack.setAmount(0);
        Assert.assertEquals(0.0, rosePack.getPrice(), 0.01);

        rosePack.setAmount(-5);
        Assert.assertEquals(0.0, rosePack.getPrice(), 0.01);

        rosePack.setAmount(1);
        Assert.assertEquals(35.0, rosePack.getPrice(), 0.01);
    }
}