package controller;

import model.entity.equipment.Equipment;
import model.entity.weapon.Weapon;

import java.util.*;

public class UtilityAlgorithms {

    /**
      * @param equipment
      * @param weapon
      * @return count sum of equipment
      */
    public static int sumEquipment(List<Equipment> equipment, Weapon weapon) {
        int sum = 0;
        for (Equipment e : equipment) {
            sum += e.getPrice();
        }
        sum += weapon.getPrice();
        return sum;
    }

     /**
      * @param equipment
      * @return sort equipment in growth weight
      */
    public static Equipment[] sortEquipment(List<Equipment> equipment) {
      Equipment[] array = new Equipment[equipment.size()];
      array = equipment.toArray(array);
      for (int barrier = array.length - 1; barrier >= 0; barrier--) {
          for (int index = 0; index < barrier; index++) {
              if (array[index].getWeight() >
                        array[index + 1].getWeight()) {
                Equipment tmp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = tmp;
            }
         }
      }
        return array;
    }

    public static List<Object> rangeEquipment(int currentFrom, int currentTo, List<Equipment> eq, Weapon weapon) {
        List<Object> objArr = new ArrayList<Object>();
        for (Equipment e : eq) {
            if (e.getPrice() >= currentFrom &&
                    e.getPrice() <= currentTo) {
                objArr.add(e);
            }
        }

        if (weapon.getPrice() >= currentFrom &&
                weapon.getPrice() <= currentTo) {
            objArr.add(weapon);
        }

        return objArr;
    }

}
