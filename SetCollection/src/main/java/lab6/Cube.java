package lab6;

import java.util.*;

public class Cube extends Toys{
    private double price;
    private String nameModel;

    public Cube(String colour, String nameModel, double price, double age) {
        super(colour, nameModel, price, age);
        this.price = price;
        this.nameModel = nameModel;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cube) {
            return super.equals(obj) && this.price == ((Cube) obj).price;
        }
        return false;
    }
}
