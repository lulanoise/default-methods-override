
package it.develhope.defaultmethodsoverride;

import java.util.Objects;

/**
 * This class defines the SmartphonePrice properties and has 4 default methods override, implementing Cloneable
 */
public class SmartphonePrice implements Cloneable{

    public String priceType;
    public int priceInEuros;

    // override of the default clone() method

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (SmartphonePrice)super.clone();
    }
    // override of the default toString() method - returns a String with the 2 attributes regarding a SmartphonePrice

    @Override
    public String toString() {
        return "SmartphonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuros=" + priceInEuros +
                '}';
    }

    // override of the default equals() method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 &&
                Objects.equals(priceType, that.priceType);
    }
    // override of the hashcode() method
    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    /**
     * Constructor method for SmartphonePrice
     * @param type a String about the type of price (e.g. Retail or Producer)
     * @param price a double about the amount in euros
     */

    public SmartphonePrice (String type, int price){
        this.priceType = type;
        this.priceInEuros = price;

    }
}