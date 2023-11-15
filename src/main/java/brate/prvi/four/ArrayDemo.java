package brate.prvi.four;

public class ArrayDemo {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(number);
        number = 10;
        System.out.println(number);
        number = 21;
        System.out.println(number);

        //Prvi slozeni tip podataka je niz
        /**
         *1.opcija..zauzmem memorije koliko mi treba
         * Koliko polja u toj varijabli ja treba ili koliko brojeva cu skladistiti u nizu
         * brojevi -> u njoj mogu biti skladistena 3 broja int tipa
         * 23 10 21
         * _ _ _
         * 0 1 2
         */
        int [] brojevi = new int [3];
        brojevi [0] = 23;
        brojevi [1] = 10;
        brojevi [2] = 21;
        System.out.println("Element na indeksu 0 :" + brojevi[0]);
        System.out.println("Element na indeksu 1 :" + brojevi[1]);
        System.out.println("Element na indeksu 2 :" + brojevi[2]);

        /**
         * 2.nacin
         *
         */
        int[] numbers = {23,10,21};

    }
}
