package model.entity.equipment;

import static model.entity.equipment.Material.*;

public enum Equipment {
    MAIL_ARMOR(2000, 7.7F, STEEL ),
    HELMET(500, 2.2f, STEEL),
    GLOVES(250, 0.1f, STEEL),
    BOOTS(1000, 1.2f, STEEL);

    int price;
    float weight;
    Material material;

    Equipment(int price, float weight) {
        this.price = price;
        this.weight = weight;
    }

    Equipment(int price, float weight, Material material) {
        this(price, weight);
        this.material = material;
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

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
