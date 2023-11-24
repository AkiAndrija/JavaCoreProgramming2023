package brate.prvi.seven.oop;

public class FilmDemo {
    public static void main(String[] args) {
        Film film1 = new Film();
        film1.naslov = "Prohujalo s vihorom";
        film1.reziser = "Kevi Spacey";
        film1.trajanje = 238;
       // film1.recencija = 10;

        Film film2 = new Film();
        film2.naslov = "Notebook";
        film2.reziser = "";
        film2.trajanje = 123;
        // film2.recencija = 9;

        Film film3 = new Film();
        film3.naslov = "Lord of the rings";
        film3.reziser = "Peter Jackson";
        film3.trajanje = 56;
        // film3.recencija = 5;
    }
}
