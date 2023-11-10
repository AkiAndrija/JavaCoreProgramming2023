package brate.prvi.two;

public class Question2 {
    public static void main(String[] args) {
        double doubleNumber = 0.3;
        System.out.println(doubleNumber);
        //EKSPLICIYNA
        float floatNumber = (float) doubleNumber;
        //AUTOMATSKA
        double thirdNumber = doubleNumber;
        float floatSampleNumber = 0f;
        double  doubleSampleNumber = 0.0;
        boolean comparisonResult = floatSampleNumber==doubleSampleNumber;
        System.out.println(comparisonResult);
    }
}
