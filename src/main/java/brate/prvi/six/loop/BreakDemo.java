package brate.prvi.six.loop;

import javax.swing.*;

/**
 * Zadatak
 * Imate ponudjen  niz brojeva 32,87,589,13,23,107876,2000,8,6222,12
 * Treba da dopustite korisniku da unese neki broj i da okusa srecu
 * Ukoliko je navedeni broj pronadjen da mu saopstite  da je srecko
 * Ukoliko nije da saopstite da je nesrecko
 *
 *
 *
 */

public class BreakDemo {
    public static void main(String[] args) {
        int numbers [] = {32,87,589,13,23,107876,2000,8,6222,12};
        String korisnickiUnos = JOptionPane.showInputDialog("Unesi celi broj");
        int enteredNumber = Integer.parseInt(korisnickiUnos);
       boolean srecan = false;
       for(int i=0;i<numbers.length;i++){
           if(numbers[i] == enteredNumber){
               srecan = true;
               break;
           }
       }
       String message = srecan ? "Srecan":"Nesrecan";
        /*if (srecan) {
            message="Srecan";
        }else{
            message="Nesrecan";
         */
        System.out.println(message);
        }
    }

