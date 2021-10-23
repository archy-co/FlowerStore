import flowerstore.*;

public class Main{
    public static void main(String [] args){
        int [] red = {255, 0, 0};
        int [] dark_red = {127, 0, 0};
        int [] yellow = {255, 255, 0};
        int [] white = {255, 255, 255};
        int [] violet = {255, 0, 255};

        Flower chamomile = new Chamomile(9.75, 25.5, white);
        Flower rose = new Rose(21.5, 35.0, red);
        Flower tulip = new Tulip(22.0, 40.0, violet);

        System.out.println(chamomile);
        System.out.println(rose);

        FlowerPack rosePack = new FlowerPack(rose, 5);
        FlowerPack tulipPack = new FlowerPack(tulip,4);
        System.out.println(rosePack.getPrice());
        System.out.println(tulipPack.getPrice());

        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowerPacks(rosePack);
        bucket.addFlowerPacks(tulipPack);

        System.out.println(bucket.getPrice());
    }
}