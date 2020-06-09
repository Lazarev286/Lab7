import lab6.BigCar;
import lab6.Toys;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Toys toys1 = new BigCar("red1", "first", 100, 255);
        Toys toys2 = new BigCar("red2", "second", 1003, 225);
        Toys toys3 = new BigCar("red3", "third", 1040, 255);
        Toys toys4 = new BigCar("red4", "fourth", 1500, 275);


        Set set = new Set();
        set.add(toys1);
        set.add(toys2);
        set.add(toys3);
        set.add(toys4);

        set.add(toys1);
        set.add(toys2);
        set.add(toys3);
        set.add(toys4);

        set.add(toys1);
        set.add(toys2);
        set.add(toys3);
        set.add(toys4);

        set.remove(toys1);
        System.out.println( set.contains(toys2));

        for (Toys toys : set) {
            System.out.println(toys);
        }

    }

}
