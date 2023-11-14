package brate.prvi.three.operator;

/**
 * Unarni operatori
 * +
 * -
 * ++ pre i posle
 * --
 * ! logicki komplement operator
 */

public class UnaryDemo {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(number);
        number = - 23;
        System.out.println(number);
        number ++; //POST INCREMENT
        System.out.println(number);
        number = 23;
        ++number;// PRE INCREMENT
        System.out.println(number);
        number = 23;
        System.out.println(number++);//salje u konzolu number pa tek onda uvecava za jedan
        System.out.println(number); //24

        boolean success = false;
        System.out.println(!success);

    }

}
