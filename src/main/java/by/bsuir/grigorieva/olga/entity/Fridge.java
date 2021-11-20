package by.bsuir.grigorieva.olga.entity;

import java.util.Objects;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public class Fridge extends Appliance{
    private int numberOfShelves;
    private String construct;
    private int powerConsumption;

    public Fridge(int price, String brand, int width, int height, int numberOfShelves, String construct, int powerConsumption) {
        super();
        this.numberOfShelves = numberOfShelves;
        this.construct = construct;
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public String getConstruct() {
        return construct;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }

    public void setConstruct(String construct) {
        this.construct = construct;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fridge fridge = (Fridge) o;
        return numberOfShelves == fridge.numberOfShelves && powerConsumption == fridge.powerConsumption && Objects.equals(construct, fridge.construct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfShelves, construct, powerConsumption);
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", numberOfShelves=" + numberOfShelves +
                ", construct='" + construct + '\'' +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
}
