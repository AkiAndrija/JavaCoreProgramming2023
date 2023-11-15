package brate.prvi.four.flow;

import javax.swing.*;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String weekDayName = JOptionPane.showInputDialog("Unesi ime dana u sednici");
       String weekDayNativeName;
        switch (weekDayName){
            case "Lundi" :
           weekDayNativeName = "Ponedeljak";
            break;
            case "Mardi" :
                weekDayNativeName = "Utorak";
                break;
            case "Mercredi" :
                weekDayNativeName = "Sreda";
                break;
            case "Jeudi" :
                weekDayNativeName = "Cetvrtak";
                break;
            case "Vendredi":
                weekDayNativeName = "Petak";
                break;
            case "Samedi" :
                weekDayNativeName = "Subota";
                break;
            case "Dimanche" :
                weekDayNativeName = "Nedelja";
                break;
            default:
                weekDayNativeName = "Nepoznat";
        }
        JOptionPane.showMessageDialog(null, weekDayNativeName);

    }
}
