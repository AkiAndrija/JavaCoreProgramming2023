package brate.prvi.four.flow;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj :");
        int korisnickiBroj = new Scanner(System.in).nextInt();
        if(korisnickiBroj%2==0) {
            System.out.println("Broj je paran");
        } else{
                System.out.println("Broj je neparan :");
            }
        }
    }

