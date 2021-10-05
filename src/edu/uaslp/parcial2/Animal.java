package edu.uaslp.parcial2;

public class Animal {

    private String color;
    private int size;
    private int numberOfLegs;

    public void eat() {
        System.out.println("Search food");
        System.out.println("Catch food");
        System.out.println("Gobble");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }


}
