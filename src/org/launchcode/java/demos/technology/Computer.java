package org.launchcode.java.demos.technology;

public class Computer extends AbstractEntity {

    // whichever one is the parent class, need 3 properties, 2 methods, 1 constructor
    // for child classes, need at LEAST 1 additional property and 1 additional method.
    // they want j unit tests too..... but probly not gonna....

    // we want a unique id to be assigned to every object we create
    // make an Id property. there is something to copy paste about like nextId ++
    // or something like that

    // we also want abstract entity, because every single object created from classes
    // needs unique id

    // ok i dont understand at all what this program is supposed to do....

    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public Computer(int ram, int storage, boolean hasKeyboard) {
        super();
        // so, putting super in there is calling the constructor of the parent class.
        // which is the thing that give this brand new object access to
        // objectId and nextId;
        // so, this brand new object that i just created, it takes a look at what nextId is
        // and then it adds 1 to it, and sets it to its own objectId
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }

    // again i dont really understand where they asked for all these random methods, but whatever
    public void increaseRAM(int n){
        this.ram = this.ram+n;
    }

    public void increaseStorage(int n){
        this.storage = this.storage+n;
    }

}
