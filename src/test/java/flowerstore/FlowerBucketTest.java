package flowerstore;

import flowerstore.Flower;
import flowerstore.FlowerPack;
import flowerstore.FlowerBucket;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlowerBucketTest {

    private FlowerBucket bucket;

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
        rose = new Rose(21.5, 35.0, red);
        tulip = new Tulip(22.0, 40.0, violet);

        rosePack = new FlowerPack(rose, 5);
        tulipPack = new FlowerPack(tulip,4);

        bucket = new FlowerBucket();
        bucket.addFlowerPacks(rosePack);
    }

    @Test
    public void addFlowerPacks() {
        Assert.assertEquals(1, bucket.getFlowerPacks().size());
        bucket.addFlowerPacks(tulipPack);
        Assert.assertEquals(2, bucket.getFlowerPacks().size());
    }

    @Test
    public void getPrice() {
        Assert.assertEquals(175.0, bucket.getPrice(), 0.01);
        bucket.addFlowerPacks(tulipPack);
        Assert.assertEquals(335.0, bucket.getPrice(), 0.01);
    }
}