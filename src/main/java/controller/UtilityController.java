package controller;

import static model.entity.equipment.Material.*;
import static controller.RegexConstant.*;
import static view.TextConstant.*;

import model.entity.Knight;
import model.entity.equipment.Equipment;
import model.entity.weapon.*;
import model.Model;
import view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtilityController {
    private Model model;
    private View view;
    private Scanner sc;

    

    public UtilityController(Model model, View view, Scanner sc) {
        this.model = model;
        this.view = view;
        this.sc = sc;
    }

    void utilityStart() {
        //Create the knight
        Knight knight = new Knight.Builder(inputString(NAME_OF_KNIGHT, REGEX_NAME)).
                                            setEquipment(knightEquipment()).
                                            setWeapon(knightWeapon()).build();
        model.setKnight(knight);
        view.printMessage(model.getKnight().toString());
        view.printMessage(view.printText(EMPTY_LINE));

        //Sorting elements
        Equipment[] equipment = UtilityAlgorithms.sortEquipment(model.getKnight().getEquipment());
        for (Equipment e : equipment) {
            view.printMessage(e.toString() + view.printText(WEIGHT) + e.getWeight());
        }
        view.printMessage(view.printText(EMPTY_LINE));

        //Count the sum
        Integer sum = UtilityAlgorithms.sumEquipment(model.getKnight().getEquipment(),
                                                        model.getKnight().getWeapon());
        view.printMessage(view.printText(TOTAL_PRICE) + sum.toString());
        view.printMessage(view.printText(EMPTY_LINE));

        //Count range of Equipment
        List<Object> rangeEquipment =
                UtilityAlgorithms.rangeEquipment(
                        1000,3000,
                        model.getKnight().getEquipment(),
                        model.getKnight().getWeapon());
        view.printMessage(rangeEquipment.toString());
    }

    String inputString(String message, String regex) {
        String res;
        view.printStringInput(message);
        while (!(sc.hasNext() &&
                (res = sc.nextLine()).matches(regex))) {
            view.printWrongInput(message);
        }
        return res;
    }

    /**
     * @return equipment of the knight
     */
    public List knightEquipment() {
        List<Equipment> equipment = new ArrayList<Equipment>();

        Equipment mailArmor = Equipment.MAIL_ARMOR;
        mailArmor.setPrice(2000);
        mailArmor.setWeight(7.7f);
        mailArmor.setMaterial(STEEL);
        equipment.add(mailArmor);

        Equipment helmet = Equipment.HELMET;
        helmet.setPrice(500);
        helmet.setWeight(1.1f);
        helmet.setMaterial(BRONZE);
        equipment.add(helmet);

        Equipment gloves = Equipment.GLOVES;
        gloves.setPrice(250);
        gloves.setWeight(0.1f);
        gloves.setMaterial(GOLD);
        equipment.add(gloves);

        Equipment boots = Equipment.BOOTS;
        boots.setPrice(1000);
        boots.setWeight(1.3f);
        boots.setMaterial(LEATHER);
        equipment.add(boots);

        return equipment;
    }

    /**
     *
     * Factory Method
     * @return weapon
     */
    public Weapon knightWeapon() {
        Weapon weapon;
        String str = inputString(CHOOSE_THE_WEAPON, REGEX_WEAPON);
        int i = Integer.parseInt(str);
        switch (i) {
            case 0 : { weapon = new Sword(1000, 6, 1500); break;}
            case 1 : { weapon = new Spear(900, 7, 1200); break;}
            case 2 : { weapon = new Bow(800, 3, 300); break;}
            case 3 : { weapon = new Axe(700, 5, 800); break;}
            default : { weapon = null;}
        }
        return weapon;
    }
}
