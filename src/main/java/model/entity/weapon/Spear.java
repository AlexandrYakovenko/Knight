package model.entity.weapon;

public class Spear extends Weapon {
    private int poking;

    public Spear(int price, float weight, int poking) {
        super(price, weight);
        this.poking = poking;
    }
    public Spear(int price, float weight, int height, int poking) {
        super(price, weight, height);
        this.poking = poking;
    }

    public int getPoking() {
        return poking;
    }

    public void setPoking(int poking) {
        this.poking = poking;
    }

    @Override
    public String toString() {
        return "Spear{" + super.toString() +
                "poking=" + poking +
                '}';
    }
}
