
package it.develhope.defaultmethodsoverride;

import java.util.Objects;
/**
 * This class defines the basic Smartphone properties and has 4 default methods override, implementing Cloneable
 */
public class Smartphone implements Cloneable{
    public String brandName;
    public String modelName;
    public int batterymAh;
    public SmartphonePrice producerPrice;
    public SmartphonePrice retailPrice;

    // override of the toString() method in order to return a String with all the details regarding a Smartphone
    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }

    // override of the equals() method for checking if two Smartphone objects are the same

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh &&
                Objects.equals(brandName, that.brandName) &&
                Objects.equals(modelName, that.modelName) &&
                Objects.equals(producerPrice, that.producerPrice) &&
                Objects.equals(retailPrice, that.retailPrice);
    }

    // override for getting the hashcode (it could give back a negative int)
    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    // override of the clone() method (protected --> public)

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone)super.clone();
        clonedSmartphone.producerPrice = (SmartphonePrice) producerPrice.clone();
        clonedSmartphone.retailPrice = (SmartphonePrice) producerPrice.clone();
        return clonedSmartphone;
    }

    /**
     * Constructor method for Smartphone
     * @param brand a String for the brand name
     * @param model a String for the model name
     * @param battery an int for the battery's mAh
     * @param prodP a SmartphonePrice object for the producer price
     * @param retailP a SmartphonePrice object for the retailer price
     */
    public Smartphone (String brand, String model, int battery,SmartphonePrice prodP, SmartphonePrice retailP){
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }
}
