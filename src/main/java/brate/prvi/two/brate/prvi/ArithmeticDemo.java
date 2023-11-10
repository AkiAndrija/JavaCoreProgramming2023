package brate.prvi.two.brate.prvi;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj: ");
        int number2 = new Scanner(System.in).nextInt();
        int result = number1 + number2;
        System.out.println("Suma= " + result);
        result = number1 - number2;
        System.out.println("Razlika je:" +result);
        result = number1 * number2;
        System.out.println("Proizvod je :" + result);
    }

}
