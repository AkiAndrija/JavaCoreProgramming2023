package brate.prvi.four;

public class MultiDimeArrayDemo {
    //Duzina  niza  nameSurnameArray = 2
    //Duzina prvog elemnta na indeksu 0  koji je ponovno niz duzine  = 3
    //Duzina drugog elementa na indeksu 1 koji je ponovno niz duzine = 2
    public static void main(String[] args) {
        String [][] nameSurnameArray = {
                { "Mr." , "Mrs.", "Ms."},
                { "Smith", "Jones"}


        };
        // Mr. Smith
        System.out.println(nameSurnameArray[0][0]+" " + nameSurnameArray[1][0]);
        //Mrs. Jones
        System.out.println(nameSurnameArray[0][1]+ " " + nameSurnameArray[1][1]);
    }
}
