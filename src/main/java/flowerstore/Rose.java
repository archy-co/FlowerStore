package flowerstore;

import flowerstore.Flower;
import flowerstore.FlowerType;

public class Rose extends Flower implements FlowerType{
    public Rose(double sepalLength, double price, int[] color) {
        super(sepalLength, price, color);
    }
}
