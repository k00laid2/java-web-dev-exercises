package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }
    // a useless constructor, because we NEED a name. zero point in having this one
//    public HouseCat(double aWeight) {
//        super(aWeight);
//    }
    // but this one, with a name, apparently also uses the base constructor from 'Cat', which gives
    // us the default weight of 13 that we put in.
    public HouseCat(String aName) {
        name = aName;
    }


    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        if (isSatisfied()) {
            return "Hello, my name is " + name + "!";
        } else {
            return super.noise(); // prints "Meeeeeeooooowww!"
        }
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}
