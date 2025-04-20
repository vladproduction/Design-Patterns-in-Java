package com.vladproduction.creational.factory.practical;

public abstract class DocumentCreator {

    //factory method as abstract
    public abstract Document createDocument();

    // Operations on the document
    public void editDocument() {
        Document document = createDocument();
        document.open();
        document.save();
        document.close();
    }

}
