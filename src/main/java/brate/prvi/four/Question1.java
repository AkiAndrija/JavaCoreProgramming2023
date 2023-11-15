package brate.prvi.four;

import java.util.Scanner;

/**
 * Napraviti program koji ce na izlazu prikazivati da li je vrednost promenljive koju je
 * korisnik uneo parna
 * Takodje treba da bude prikazana unesena vrednost
 */

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        int broj  = new Scanner(System.in).nextInt();
        System.out.println("Entered value  is =" + broj);
        int ostatak = broj % 2;
        if(ostatak==0) {
            System.out.println("Unesena vrednost je parna");
        }
        if(ostatak==1){
            System.out.println("Unesena vrednost je neparna:");

        }
    }
}
