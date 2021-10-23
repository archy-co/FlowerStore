package flowerstore;

import lombok.*;
import java.util.Arrays;

@Setter @Getter
public class Flower{
    private double sepalLength;
    private double price;
    private int [] color;

    private FlowerType flowerType;

    public void setColor(int [] color){
        this.color = Arrays.copyOf(color, color.length);
    }

    public double getPrice(){
        return this.price;
    }

    public Flower() { }

    public Flower(double sepalLength, double price, int [] color){
        this.sepalLength = sepalLength;
        this.price = price;
        setColor(color);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "sepalLength=" + sepalLength +
                ", price=" + price +
                ", color=" + Arrays.toString(color) +
                '}';
    }
}