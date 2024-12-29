package com.vladproduction.library_system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Author class with name
 * and collection of magazines associated to this author
 * */
public class Author {

    private String name;
    private List<Magazine> magazines;

    public Author(String name) {
        this.name = name;
        this.magazines = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Magazine> getMagazines() {
        return magazines;
    }

    public void addMagazine(Magazine magazine){
        magazines.add(magazine);
    }

    public Iterator<Magazine> magazineIterator(){
        return magazines.iterator();
    }
}
