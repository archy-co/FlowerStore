package flowerstore;

import java.util.ArrayList;

public class FlowerBucket {
    ArrayList<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public FlowerBucket() { }

    public FlowerBucket(ArrayList<FlowerPack> flowerPacks) {
        this.flowerPacks = flowerPacks;
    }

    public void addFlowerPacks(FlowerPack flowerPack){
        this.flowerPacks.add(flowerPack);
    }

    public ArrayList<FlowerPack> getFlowerPacks() {
        return flowerPacks;
    }

    public double getPrice(){
        double totalPrice = 0;
        for (FlowerPack flowerPack : this.flowerPacks) {
            totalPrice += flowerPack.getPrice();
        }
        return totalPrice;
    }
}