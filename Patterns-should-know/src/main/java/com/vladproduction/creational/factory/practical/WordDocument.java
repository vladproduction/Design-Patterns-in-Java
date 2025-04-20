package com.vladproduction.creational.factory.practical;

public class WordDocument extends Document {

    @Override
    void open() {
        System.out.println("Word Document open");
    }

    @Override
    void save() {
        System.out.println("Word Document save");
    }

    @Override
    void close() {
        System.out.println("Word Document close");
    }
}
