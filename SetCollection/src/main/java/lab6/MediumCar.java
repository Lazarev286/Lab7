package lab6;

public class MediumCar extends Toys{
    private double price;
    private String nameModel;

    public MediumCar(String colour, String nameModel, double price, double age) {
        super(colour, nameModel, price, age);
        this.price = price;
        this.nameModel = nameModel;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MediumCar) {
            return super.equals(obj) && this.price == ((MediumCar) obj).price;
        }
        return false;
    }
}
