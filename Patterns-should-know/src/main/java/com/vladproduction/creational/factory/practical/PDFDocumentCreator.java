package com.vladproduction.creational.factory.practical;

public class PDFDocumentCreator extends DocumentCreator {

    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
