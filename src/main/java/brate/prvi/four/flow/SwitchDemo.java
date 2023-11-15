package brate.prvi.four.flow;

import javax.swing.*;

/**
 * Zadatak : Imate tastaturu od 7 brojeva
 * vas sin moze stisnuti jedan od tih 7 brojeva
 * 1 2 3 4 5 6 7
 *
 * Kada god pritisnu broj iskoci naziv dana u sednici.
 * example za broj -> "Mittwoch"
 * 4 -> "Donnerstag
 *
 * 6 -> "Samstag"
 * 7 -> "Sonntad"
 */

public class SwitchDemo {
    public static void main(String[] args) {
        String unos = JOptionPane.showInputDialog("Unesi redni broj dana u sednici");
        int weekDayNumber = Integer.parseInt(unos);
        String weekDayName;
        switch (weekDayNumber) {
            case 1:
                weekDayName = "Lundi";
                break;
            case 2:
                weekDayName = "Mardi";
                break;
            case 3:
                weekDayName = "Mercredi";
                break;
            case 4:
                weekDayName = "Jeudi";
                break;
            case 5:
                weekDayName = "Vendredi";
                break;
            case 6:
                weekDayName = "Samedi";
                break;
            case 7:
                weekDayName = "Dimanche";
                break;
            default:
                weekDayName = "Non trover";
        }
        JOptionPane.showMessageDialog(null, weekDayName);

        }

    }

