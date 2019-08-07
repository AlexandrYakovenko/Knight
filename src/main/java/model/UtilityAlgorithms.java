package model;

import model.entity.equipment.Equipment;
import model.entity.weapon.Weapon;

import java.util.*;
import java.util.stream.Collectors;

public class UtilityAlgorithms {

    /**
      * @param equipment
      * @param weapon
      * @return count sum of equipment
      */
    public static int sumEquipment(List<Equipment> equipment, Weapon weapon) {
        Optional<Integer> sum = equipment.stream()
                .map(Equipment::getPrice).reduce((x, y) -> x + y);
        return sum.get() + weapon.getPrice();
    }

     /**
      * @param equipment
      * @return sort equipment in growth weight
      */
    public static List<Equipment> sortEquipment(List<Equipment> equipment) {
        return equipment.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Object> rangeEquipment(int currentFrom, int currentTo, List<Equipment> eq, Weapon weapon) {
       List<Object> equipment = eq.stream()
               .filter(x -> x.getPrice() > currentFrom && x.getPrice() < currentTo)
               .collect(Collectors.toList());

       if (weapon.getPrice() >= currentFrom &&
               weapon.getPrice() <= currentTo) {
           equipment.add(weapon);
       }

       return equipment;
    }

}
