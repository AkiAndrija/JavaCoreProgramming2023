package brate.prvi.seven.oop;

public class Film {
    public String reziser;
    public String naslov;
    public int trajanje;
    private int recencija; //1-10

    public void setRecencija(int recencija) {
        if(recencija>10){
            recencija=10;
        }
        if(recencija<1){
            recencija=1;
        }
        this.recencija=recencija;
    }

    public int getRecencija() {
        return recencija;
    }
}
