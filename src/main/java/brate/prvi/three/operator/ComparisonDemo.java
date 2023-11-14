package brate.prvi.three.operator;

import java.util.Scanner;

/**
 * == equal to
 * != not equal to
 * > greater than
 * <
 * >=    <=
 */

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj :");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj :");
        int number2 = new Scanner(System.in).nextInt();

        //boolean comaprisonResult = number1 == number2;
        if(number1==number2) {
            System.out.println("Uneseni brojevi su jednaki");
        }
            if(number1!=number2) {
                System.out.println("Uneseni brojevi nisu jednaki");
            }
            if(number1>number2) {
                System.out.println("Prvi broj je veci od drugog");
            }
            if(number1>=number2) {
                System.out.println("Prvi broj je veci ili jednak drugom");
            }
            if(number1<number2) {
                System.out.println("Prvi broj je manji od drugog");
            }
            if(number1<=number2) {
                System.out.println("Prvi broj je manji ili jednak drugom");
            }


            }
        }



