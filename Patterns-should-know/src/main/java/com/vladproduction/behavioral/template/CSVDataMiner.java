package com.vladproduction.behavioral.template;

public class CSVDataMiner extends DataMiner {

    @Override
    protected void extractData() {
        System.out.println("Extracting data from CSV file...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data using comma delimiters...");
    }

}
