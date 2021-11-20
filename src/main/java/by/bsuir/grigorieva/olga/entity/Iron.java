package by.bsuir.grigorieva.olga.entity;

import java.util.Objects;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public class Iron extends Appliance {
    private String ironSole;
    private int steamBoost;
    private int powerConsumption;

    public Iron() {
    }

    public Iron(int price, String brand, int width, int height, String ironSole, int steamBoost, int powerConsumption) {
        setPrice(price);
        this.ironSole = ironSole;
        this.steamBoost = steamBoost;
        this.powerConsumption = powerConsumption;
    }

    public String getIronSole() {
        return ironSole;
    }

    public int getSteamBoost() {
        return steamBoost;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setIronSole(String ironSole) {
        this.ironSole = ironSole;
    }

    public void setSteamBoost(int steamBoost) {
        this.steamBoost = steamBoost;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Iron iron = (Iron) o;
        return steamBoost == iron.steamBoost && powerConsumption == iron.powerConsumption && Objects.equals(ironSole, iron.ironSole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ironSole, steamBoost, powerConsumption);
    }

    @Override
    public String toString() {
        return "Iron{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", ironSole='" + ironSole + '\'' +
                ", steamBoost=" + steamBoost +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
}
