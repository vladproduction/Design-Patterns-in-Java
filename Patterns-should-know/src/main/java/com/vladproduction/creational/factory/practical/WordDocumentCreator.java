package com.vladproduction.creational.factory.practical;

public class WordDocumentCreator extends DocumentCreator {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
