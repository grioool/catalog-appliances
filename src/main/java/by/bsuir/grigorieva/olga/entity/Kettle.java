package by.bsuir.grigorieva.olga.entity;

import java.util.Objects;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

public class Kettle extends Appliance {
    private String bodyMaterial;
    private int powerConsumption;
    private String bulbMaterial;

    public Kettle() {
    }

    public Kettle(int price, String brand, int width, int height, String bodyMaterial, String bulbMaterial, int powerConsumption) {
        super(price, brand, width, height);
        this.bodyMaterial = bodyMaterial;
        this.bulbMaterial = bulbMaterial;
        this.powerConsumption = powerConsumption;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getBulbMaterial() {
        return bulbMaterial;
    }

    public void setBulbMaterial(String bulbMaterial) {
        this.bulbMaterial = bulbMaterial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kettle kettle = (Kettle) o;
        return powerConsumption == kettle.powerConsumption && Objects.equals(bodyMaterial, kettle.bodyMaterial) && Objects.equals(bulbMaterial, kettle.bulbMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyMaterial, powerConsumption, bulbMaterial);
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", bodyMaterial='" + bodyMaterial + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", bulbMaterial='" + bulbMaterial + '\'' +
                '}';
    }
}
