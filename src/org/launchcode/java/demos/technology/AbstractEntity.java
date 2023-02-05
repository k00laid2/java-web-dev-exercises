package org.launchcode.java.demos.technology;

public abstract class AbstractEntity {

    // each new object that we create needs a unique identifier
    private int objectId;
    private static int nextId = 1;
    // static means it belongs to the class, instead of any 1 object that
    // instead of any 1 object that we instantiated
    // every single object created from the abstract entity
    // they will all share the static 'nextId' field.
    // should update to 2, update to 3, etc etc etc.

    public AbstractEntity() {
        this.objectId = nextId;
        nextId++;
    }
    // so the constructor exists, even if i dont write it
    // now every single time an object is constructed, it is going to take the static thing
    // and update the field objectId

    // now we do want to be able to get the Id, but we don't want to be able to set the Id.
    public int getObjectId() {
        return objectId;
    }
}
