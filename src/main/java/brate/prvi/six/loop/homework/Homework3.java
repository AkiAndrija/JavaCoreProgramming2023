package brate.prvi.six.loop.homework;

import java.util.Enumeration;
import java.util.Random;

/**
 * Ideja je da uradite zadatak upgrade na zadatak BrekaDemo3
 * Element niza numbers trebate generisati na nacin  da se uvek generisu random
 * Niz numbers treba uvek da  imaju 11 generisanih brojeva;
 * Brojevi treba da budu u range od 0 do 1000;
 */

public class Homework3 {
    public static void main(String[] args) {
        int [] numbers = {32, 87, 589, 13, 23, 107876, 2000, 8, 6222, 12};
        //trik koji ce vam pomoci po slucajnom uzorku generiste brojeve od 0 do 1000;
        Random random = new Random();
                int number = random.nextInt(0,1000);

    }
}
