package model.entity;

import model.entity.equipment.Equipment;
import model.entity.weapon.Weapon;

import java.util.List;

public class Knight {
    private String name;
    private List<Equipment> equipment;
    private Weapon weapon;

    private Knight(Builder builder) {
        this.name = builder.name;
        this.equipment = builder.equipment;
        this.weapon = builder.weapon;
    }

    public String getName() {
        return name;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public static class Builder {
        private String name;
        private List<Equipment> equipment;
        private Weapon weapon;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setEquipment(List<Equipment> equipment) {
            this.equipment = equipment;
            return this;
        }

        public Builder setWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Knight build() {
            return new Knight(this);
        }
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + getName() + '\'' +
                ", equipment=" + getEquipment() +
                ", weapon=" + getWeapon() +
                '}';
    }
}
