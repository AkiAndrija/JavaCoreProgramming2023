package brate.prvi.two;

public class TwoExecutor {
    public static void main(String[] args) {
        //Promenljive -128 ... 0 ...127
        byte byteNumber = -128;
        //16 bit
        short maxShortNumber = 32767;
        short minShortNumber = -32768;
        // 32 bit... DEFAULT CELI BROJ
        int number = 1000001;
        //64 bit
        long longNumber = 100000000000L;
        /**
         * DECIMALNI BROJEVI
         */
        //32 bit
        float floatNumber = 23.03F;
        //64bit
        double doubleNumber = 23.03;
        /**
         *  CHARACTERS
         */
        char  slovo = '!';
        slovo = 'a';
        System.out.println("Provera: " + slovo);
        slovo = 65;
        System.out.println("Provera: " + slovo);
        slovo = 'A';
        int slovoNumber = slovo;
        System.out.println("Provera: " + slovoNumber);
    }
}
