package model.entity.weapon;

public class Bow extends Weapon {
    private int firingRange;

    public Bow(int price, float weight, int firingRange) {
        super(price, weight);
        this.firingRange = firingRange;
    }

    public Bow(int price, float weight, int height, int firingRange) {
        super(price, weight, height);
        this.firingRange = firingRange;
    }

    public int getFiringRange() {
        return firingRange;
    }

    public void setFiringRange(int firingRange) {
        this.firingRange = firingRange;
    }

    @Override
    public String toString() {
        return "Bow{" + super.toString() +
                "firingRange=" + firingRange +
                '}';
    }
}
