package lab6;

import java.util.Objects;

public abstract class Toys {
    private String colour;
    private double price;
    public String getNameModel() {
        return nameModel;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }


    public double getAge() {
        return age;
    }


    private double age;
    private String nameModel;

    public Toys(String colour, String nameModel, double price, double age) {
        this.nameModel = nameModel;
        this.colour = colour;
        this.age = age;
        this.price = price;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toys)) return false;
        Toys toys = (Toys) o;
        return Double.compare(toys.getPrice(), getPrice()) == 0 &&
                Double.compare(toys.getAge(), getAge()) == 0 &&
                Objects.equals(getColour(), toys.getColour()) &&
                Objects.equals(getNameModel(), toys.getNameModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColour(), getPrice(), getAge(), getNameModel());
    }

    @Override
    public String toString() {
        return  "\nName of Car: " + nameModel
                +"\nColour: " + colour
                + "\nMinimum age: " + age
                +"\nPrice: " + price
                ;
    }
}
