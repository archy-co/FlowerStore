package decorators;

import flowerstore.Bucket;
import flowerstore.FlowerBucket;
import flowerstore.FlowerPack;

import java.util.ArrayList;

public class BucketDecorationGeneral implements Bucket {
    public Bucket wrappee;

    public BucketDecorationGeneral(Bucket wrappee){
        this.wrappee = wrappee;
    }

    public String getDescriptor(){
        return "Bucket: ";
    }

    public void addFlowerPacks(FlowerPack flowerPack){
        wrappee.addFlowerPacks(flowerPack);
    }

    public ArrayList<FlowerPack> getFlowerPacks() {
        return wrappee.flowerPacks;
    }

    public double getPrice(){
        double totalPrice = 0;
        for (FlowerPack flowerPack : this.flowerPacks) {
            totalPrice += flowerPack.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Decorations: ";
    }
}
