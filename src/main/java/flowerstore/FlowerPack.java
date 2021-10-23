package flowerstore;

public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = Math.max(amount, 0);
    }

    public double getPrice(){
        return this.flower.getPrice() * amount;
    }

    public int getAmount() {
        return amount;
    }
}
