package controller;

import model.Model;
import view.View;

import java.util.Scanner;

 public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

     public void processUser() {
        Scanner sc = new Scanner(System.in);
        UtilityController uController = 
                new UtilityController(model, view, sc);

        uController.utilityStart();
    }

}
