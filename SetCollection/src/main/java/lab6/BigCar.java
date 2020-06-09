package lab6;

public class BigCar extends Toys{
    private double price;
    private String nameModel;

    public BigCar(String colour, String nameModel, double price, double age) {
        super(colour, nameModel, price, age);
        this.price = price;
        this.nameModel = nameModel;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BigCar) {
            return super.equals(obj) && this.price == ((BigCar) obj).price;
        }
        return false;
    }
}

