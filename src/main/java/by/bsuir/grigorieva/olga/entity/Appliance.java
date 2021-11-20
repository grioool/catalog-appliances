package by.bsuir.grigorieva.olga.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Olga Grigorieva
 * @version 0.0.1
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "Kettle", value = Kettle.class),
        @JsonSubTypes.Type(name = "Fridge", value = Fridge.class),
        @JsonSubTypes.Type(name = "Iron", value = Iron.class),
})

public class Appliance implements Serializable {
    protected int price;
    protected String brand;
    protected int width;
    protected int height;

    public Appliance(int price, String brand, int width, int height){
        this.price = price;
        this.brand = brand;
        this.width = width;
        this.height = height;
    }

    public Appliance() {
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return price == appliance.price && width == appliance.width && height == appliance.height && Objects.equals(brand, appliance.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, brand, width, height);
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
