package view;

import static view.TextConstant.*;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    final static String MESSAGE_BUNDLE = "message";
    ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGE_BUNDLE,
                    new Locale("en"));
                    /*new Locale("ua"));*/   //Ukraine


    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatMessage(String... message) {
        StringBuilder concat = new StringBuilder();
        for (String str : message) {
            concat.append(str);
        }
        return new String(concat);
    }

    public String printText(String message) {
          return bundle.getString(message);
    }

    public void printStringInput(String message){
        printMessage(concatMessage(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongInput(String message) {
        printMessage(concatMessage(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }
}
