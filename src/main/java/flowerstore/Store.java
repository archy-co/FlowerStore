package flowerstore;

import java.util.ArrayList;

public class Store {
    ArrayList<Flower> flowers = new ArrayList<Flower>();
    ArrayList<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    ArrayList<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();

    public Store() { }

    public void addFlower(Flower flower) {
        this.flowers.add(flower);
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }

    public void addFlowerBucket(FlowerBucket flowerBucket) {
        this.flowerBuckets.add(flowerBucket);
    }

    public boolean search(Flower flower){
        for(int i = 0; i < flowers.size(); i++){
            if(flower.equals( flowers.get(i))){
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Store{}";
    }
}
