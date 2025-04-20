package com.vladproduction.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private Map<String, Prototype> prototypes = new HashMap<>();

    public void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }

    public Prototype getPrototype(String key) {
        return prototypes.get(key).copy();
    }


}
