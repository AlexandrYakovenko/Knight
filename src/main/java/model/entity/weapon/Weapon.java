package model.entity.weapon;

public abstract class Weapon {
    private int price;
    private float weight;
    private int height;

    public Weapon(int price, float weight) {
        this.price = price;
        this.weight = weight;
    }

    public Weapon(int price, float weight, int height) {
        this(price, weight);
        this.height = height;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "price=" + price +
                ", weight=" + weight + ", ";
    }
}
