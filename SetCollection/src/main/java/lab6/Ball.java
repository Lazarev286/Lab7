package lab6;

import java.util.Set;

public class Ball extends Toys{
    private double price;
    private String nameModel;

    public Ball(String colour, String nameModel, double price, double age) {
        super(colour, nameModel, price, age);
        this.price = price;



    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ball) {
            return super.equals(obj) && this.price == ((Ball) obj).price;
        }
        return false;
    }
}
