package org.launchcode.java.demos.technology;

public class Laptop extends Computer{

    private double weight;
    public Laptop(int ram, int storage, boolean hasKeyboard) {
        super(ram, storage, hasKeyboard);
        this.weight = weight;
    }
    // so this constructor has to be clearly calling the parent class constructor
    // so we use super, and declare the stuff we need, we also need weight.

    public boolean isClunky() {
        if (weight > 5.0) {
            return true;
        }
        else {
            return false;
        }
    }

}
