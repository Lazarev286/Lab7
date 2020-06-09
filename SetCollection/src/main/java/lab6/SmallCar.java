package lab6;

public class SmallCar extends Toys{
    private double price;
    private String nameModel;
    public SmallCar(String colour, String nameModel, double price, double age) {
        super(colour, nameModel, price, age);
        this.price = price;
        this.nameModel = nameModel;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SmallCar) {
            return super.equals(obj) && this.price == ((SmallCar) obj).price;
        }
        return false;
    }
}
