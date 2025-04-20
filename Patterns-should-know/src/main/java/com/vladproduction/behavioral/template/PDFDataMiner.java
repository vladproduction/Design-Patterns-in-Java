package com.vladproduction.behavioral.template;

public class PDFDataMiner extends DataMiner {

    @Override
    protected void extractData() {
        System.out.println( "Extracting data from PDF...");
    }

    @Override
    protected void parseData() {
        System.out.println( "Parsing data from PDF...");
    }

    @Override
    protected void analyzeData() {
        System.out.println("Performing specialized PDF data analysis...");
    }
}
