package brate.prvi.four.flow;

import javax.swing.*;

/**
 * <p>
 *     Zadatak :
 *     Vas omiljeni profesor pregleda zadatke i fokusira se na to da precizno odgovarajuci broj poena na ispitu.
 *     kako gresko ne bi ostetio vas  i dao vam 8 iako ste ostvarili broj poena za 7
 *     vi cete mu olaksati tako sto cete mu kreirati program koji ce mu ponuditi mogucnost
 *     da unese broj poena a vas program  ce reci koja je to ocena na ispitu.
 * </p>
 *
 */

public class IfElseDemo {
    public static void main(String[] args) {
        String profinUnos = JOptionPane.showInputDialog("Unesite broj poena koje je student ostvario na ispitu:");
          int brojPoena = Integer.parseInt(profinUnos);
          // A(10) B(9) C(8) D(7) E(6) F(5)
        char ocena ;
        if(brojPoena>=90) {
            ocena = 'A';//10
        }
        else if(brojPoena>=80) {
            ocena = 'B';
        }
        else if(brojPoena>=70) {
            ocena = 'C';
        }
        else if (brojPoena>=60) {
            ocena = 'D';
        }
        else if (brojPoena>=50) {
            ocena = 'E';
        }
        else  {
            ocena = 'F';
        }
        String message = "Ocena =" + ocena;
        JOptionPane.showMessageDialog(null,message);

        }
    }


