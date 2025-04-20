package com.vladproduction.creational.factory.practical;

public class MainApp {
    public static void main(String[] args) {

        //create and edit pdf document
        DocumentCreator pdfCreator = new PDFDocumentCreator();
        pdfCreator.editDocument();

        System.out.println("\n-------\n");

        //create and edit word document
        DocumentCreator wordCreator = new WordDocumentCreator();
        wordCreator.editDocument();

    }
}
