package flowerstore;

import java.util.ArrayList;

public interface Bucket {
    ArrayList<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    public void addFlowerPacks(FlowerPack flowerPack);
    public ArrayList<FlowerPack> getFlowerPacks();
    public double getPrice();

    public String getDecorations();
}
