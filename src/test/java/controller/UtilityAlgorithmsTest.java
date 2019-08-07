package controller;

import model.entity.equipment.Equipment;
import model.entity.weapon.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static model.entity.equipment.Material.*;
import static org.junit.Assert.*;

public class UtilityAlgorithmsTest {
    private List<Equipment> equipmentList;
    private Weapon sword;
    private Weapon spear;
    private Weapon bow;
    private Weapon axe;

    @Before
    public void setUp() throws Exception {
        equipmentList = new ArrayList<Equipment>();

        Equipment mailArmor = Equipment.MAIL_ARMOR;
        mailArmor.setPrice(2000);
        mailArmor.setWeight(7.7f);
        mailArmor.setMaterial(STEEL);
        equipmentList.add(mailArmor);

        Equipment helmet = Equipment.HELMET;
        helmet.setPrice(500);
        helmet.setWeight(1.1f);
        helmet.setMaterial(BRONZE);
        equipmentList.add(helmet);

        Equipment gloves = Equipment.GLOVES;
        gloves.setPrice(250);
        gloves.setWeight(0.1f);
        gloves.setMaterial(GOLD);
        equipmentList.add(gloves);

        Equipment boots = Equipment.BOOTS;
        boots.setPrice(1000);
        boots.setWeight(1.3f);
        boots.setMaterial(LEATHER);
        equipmentList.add(boots);

        sword = new Sword(1000, 1000, 1000);
        spear = new Spear(900, 900, 900);
        bow = new Bow(800, 800, 800);
        axe = new Axe(700, 700, 700);
    }


    @Test
    public void sumEquipment() {
        int sum = 0;
        for (Equipment e : equipmentList) {
            sum += e.getPrice();
        }
        sum += sword.getPrice();
        assertEquals(4750, sum);
    }

    @Test
    public void sortEquipment() {
       Equipment[] equipmentArr = UtilityAlgorithms.sortEquipment(equipmentList);
       assertNotNull(equipmentArr);

    }

    @Ignore
    @Test
    public void rangeEquipment() {
    }
}