package brate.prvi.six.loop;

import javax.swing.*;

public class BreakDemo3 {
    public static void main(String[] args) {
        int[] numbers = {32, 87, 3, 589, 13, 23, 107876, 2000, 8, 6222, 12};
        int redniBrojPokusaja = 0;
        int uneseniBroj;
        MARKIRANA: while (true) {
            //UNOS
            String unos = JOptionPane.showInputDialog("Unesi broj i okušaj sreću");
            uneseniBroj = Integer.parseInt(unos);
            //Bilježimo redni broj pokušaja
            redniBrojPokusaja++;
            for (int i = 0; i < numbers.length; i++) {
                if (uneseniBroj == numbers[i]) {//uslov zadovoljen uneseni broj postoji u nizu
                    break MARKIRANA;
                }
            }
        }
        //Poruka je jasna
        String message = "Pogodio si iz " + redniBrojPokusaja + "-tog pokušaja. Uneseni broj " + uneseniBroj + " je tvoj sretni";
        System.out.println(message);
    }
}

