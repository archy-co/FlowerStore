package flowerstore;

import flowerstore.Flower;
import flowerstore.FlowerPack;
import flowerstore.FlowerBucket;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StoreTest {

    public Store store;

    private Flower rose;
    private Flower tulip;
    private Flower chamomile;

    private FlowerPack rosePack;

    private int [] white = {255, 255, 255};
    private int [] violet = {255, 0, 255};
    private int [] red = {255, 0, 0};

    @Before
    public void setUp(){
        chamomile = new Chamomile(9.75, 25.5, white);
        tulip = new Tulip(22.0, 40.0, violet);
        rose = new Rose(21.5, 35.0, red);
        store = new Store();
    }

    @Test
    public void addFlower(){
        Assert.assertEquals(store.flowers.size(), 0);
        store.addFlower(tulip);
        store.addFlower(rose);
        Assert.assertEquals(store.flowers.size(), 2);
    }

    @Test
    public void search() {
        store.addFlower(tulip);
        store.addFlower(rose);
        Assert.assertEquals(store.search(chamomile), false);
        Assert.assertEquals(store.search(tulip), true);
        store.addFlower(chamomile);
        Assert.assertEquals(store.search(chamomile), true);
    }
}