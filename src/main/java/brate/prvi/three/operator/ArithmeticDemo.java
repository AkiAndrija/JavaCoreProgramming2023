package brate.prvi.three.operator;

import javax.swing.*;

/**
 * Aritmeticki operatori
 * Additive +
 * Subtraction -
 * Multiplication *
 */

public class ArithmeticDemo {
    public static void main(String[] args) {
//GUI
    //    char slovo = 'a';
      //  Character character = 'a';
        // int number = 23;
     //   Integer number2 = 23;
       // String name = "23";
       // int number3 = Integer.parseInt(name);
        String number1 = JOptionPane.showInputDialog("Unesi prvi broj : ");
        int broj1 = Integer.parseInt(number1);
        String number2 = JOptionPane.showInputDialog("Unesi drugi broj");
        int broj2 = Integer.parseInt(number2);
        int suma = broj1 + broj2;

        JOptionPane.showMessageDialog(null, "Rezultat je =" + suma);
        int razlika = broj1 - broj2;
        JOptionPane.showMessageDialog(null, "Razlika je =" + razlika);
        int proizvod = broj1 * broj2;
        JOptionPane.showMessageDialog(null, "Proizvod je =" + proizvod);
        int division = broj1/broj2;
        JOptionPane.showMessageDialog(null, "Deljenje je =" + division);




    }
}
