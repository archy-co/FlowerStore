import decorators.BucketMaterialDecoration;
import decorators.BucketPaintingDecoration;
import flowerstore.*;

public class Main{
    public static void main(String [] args){
        decorationExample();
    }
    public static void decorationExample(){
        int [] red = {255, 0, 0};
        int [] dark_red = {127, 0, 0};
        int [] yellow = {255, 255, 0};
        int [] white = {255, 255, 255};
        int [] violet = {255, 0, 255};

        Flower chamomile = new Chamomile(9.75, 25.5, white);
        Flower rose = new Rose(21.5, 35.0, red);
        Flower tulip = new Tulip(22.0, 40.0, violet);

        FlowerPack rosePack = new FlowerPack(rose, 5);
        FlowerPack tulipPack = new FlowerPack(tulip,4);

        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowerPacks(rosePack);
        bucket.addFlowerPacks(tulipPack);

        Bucket bucket_with_deco = new BucketPaintingDecoration(new FlowerBucket());
        bucket_with_deco.addFlowerPacks(rosePack);
        bucket_with_deco.addFlowerPacks(tulipPack);

        System.out.println(bucket_with_deco.getDecorations());

        bucket_with_deco = new BucketMaterialDecoration(bucket_with_deco);
        System.out.println(bucket_with_deco.getDecorations());
    }
}