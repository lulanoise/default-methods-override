
package it.develhope.defaultmethodsoverride;


public class Start {

    public static void main(String[] args) {
        // create 4 new SmartphonePrice objects: 2 for Producer and 2 for Retail
        SmartphonePrice producerPrice1 = new SmartphonePrice("Producer",500);
        SmartphonePrice producerPrice2 = new SmartphonePrice("Producer",800);
        SmartphonePrice retailPrice1 = new SmartphonePrice("Retail",430);
        SmartphonePrice retailPrice2 = new SmartphonePrice("Retail",730);

        // crate two Smartphone objects using the 4 SmartphonePrice objects already created
        Smartphone smartphone1 = new Smartphone("Xiaomi","11 pro",4500,producerPrice1,retailPrice1);
        Smartphone smartphone2 = new Smartphone("Apple","Iphone 12",2815,producerPrice2,retailPrice2);

        // print the first smartphone object and the hashcode
        System.out.println(smartphone1);

        // print the second smartphone object
        System.out.println(smartphone2);

        // check if smartphone1 is equal to smartphone2
        boolean out = smartphone1.equals(smartphone2); // zebra == giraffe
        System.out.println("Is Smartphone 1 equals to Smartphone 2? " + out);


        // clone the object
        Smartphone clonedSmartphone2 = new Smartphone("Apple","Iphone 12",2815,producerPrice2,retailPrice2);

        // check if smartphone2 is equal to smartphone2Clone
        boolean out1 = smartphone2.equals(clonedSmartphone2); // zebra == giraffe
        System.out.println("Is Smartphone 2 equals to clonedSmartphone 2? " + out);

        //Try...catch expression
        try {Smartphone clonedSmartphone = smartphone2.clone();
            System.out.println("Cloned Smartphone: " + clonedSmartphone);

            if (smartphone2.equals(clonedSmartphone)) {
                System.out.println("The smartphones are equal");
            } else {
                System.out.println("The smartphones are not equal");
            }

        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("An error occurred while cloning the smartphone");
        }
    }


}
