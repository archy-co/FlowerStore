package decorators;

import flowerstore.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BucketPaintingDecorationTest {

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
        bucket.addFlowerPacks(tulipPack);
    }

    @Test
    public void withoutDeco() {
        Assert.assertEquals("Decorations:", bucket.getDecorations());
    }

    @Test
    public void initWithDeco() {
        Bucket bucket_with_paint = new BucketPaintingDecoration(new FlowerBucket());
        bucket_with_paint.addFlowerPacks(rosePack);

        Assert.assertEquals("Decorations: paint", bucket_with_paint.getDecorations());

        bucket_with_paint.addFlowerPacks(rosePack);
        Assert.assertEquals("Decorations: paint", bucket_with_paint.getDecorations());
    }

    @Test
    public void addDeco() {
        FlowerBucket bucket_simple = new FlowerBucket();
        bucket.addFlowerPacks(rosePack);
        Assert.assertEquals("Decorations:", bucket_simple.getDecorations());

        Bucket bucket_with_paint = new BucketPaintingDecoration(bucket_simple);
        Assert.assertEquals("Decorations: paint", bucket_with_paint.getDecorations());

        Bucket bucket_with_paint_n_material = new BucketMaterialDecoration(bucket_with_paint);
        Assert.assertEquals("Decorations: paint material", bucket_with_paint_n_material.getDecorations());

    }
}