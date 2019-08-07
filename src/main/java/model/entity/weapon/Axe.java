package model.entity.weapon;

public class Axe extends Weapon {
    private int damage;

    public Axe(int price, float weight, int damage) {
        super(price, weight);
        this.damage = damage;
    }

    public Axe(int price, float weight, int height, int damage) {
        super(price, weight, height);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    @Override
    public String toString() {
        return "Axe{" + super.toString() +
                "damage=" + damage +
                '}';
    }
}
