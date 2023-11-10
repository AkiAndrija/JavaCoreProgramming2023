package brate.prvi.two;

public class Question {
    public static void main(String[] args) {
        int number = 23;
        //eksplicitna
        short shortNumber = (short)number;
        System.out.println(shortNumber);
        //automatska
        long longNumber = number;
    }
}
