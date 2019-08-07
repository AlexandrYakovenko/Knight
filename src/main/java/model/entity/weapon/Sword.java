package model.entity.weapon;

public class Sword extends Weapon {
    private int sharpness;

    public Sword(int price, float weight, int sharpness) {
        super(price, weight);
        this.sharpness = sharpness;
    }

    public Sword(int price, float weight, int height, int sharpness) {
        super(price, weight, height);
        this.sharpness = sharpness;
    }

    public int getSharpness() {
        return sharpness;
    }

    public void setSharpness(int sharpness) {
        this.sharpness = sharpness;
    }

    @Override
    public String toString() {
        return "Sword{" + super.toString() +
                "sharpness=" + sharpness +
                '}';
    }
}
