package com.vladproduction.creational.factory.practical;

public class PDFDocument extends Document{

    @Override
    void open() {
        System.out.println("PDF Document open");
    }

    @Override
    void save() {
        System.out.println("PDF Document save");
    }

    @Override
    void close() {
        System.out.println("PDF Document close");
    }
}
