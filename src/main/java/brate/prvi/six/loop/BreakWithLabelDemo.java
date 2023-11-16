package brate.prvi.six.loop;

import java.util.Scanner;

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int[][] dvodimenzionalniNiz = {
                {32, 87, 589},
                {12, 1076, 2000, 8},
                {622, 127, 77, 955}
        };
        //length = 3 -> int i=0,1,2
        System.out.println("Unesi broj");
        int uneseniBroj = new Scanner(System.in).nextInt();
        boolean nasao = false;
        UCIONICA:
        for (int i = 0; i < dvodimenzionalniNiz.length; i++) {
            int[] niz = dvodimenzionalniNiz[i];
            for (int j = 0; j < niz.length; j++) {
                int brojIzNiza = niz[j];
                if (brojIzNiza == uneseniBroj) {
                    nasao = true;
                    break UCIONICA;
                }

            }
            System.out.println(nasao ? "Srecan" : "Nesrecan");

        }

    }
}