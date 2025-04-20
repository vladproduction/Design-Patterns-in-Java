package com.vladproduction.behavioral.template;

public abstract class DataMiner {

    // Template method
    public final void mineData() {
        openFile();
        extractData();
        parseData();
        analyzeData();
        sendReport();
        closeFile();
    }

    // Common steps for all miners
    protected void openFile() {
        System.out.println("Opening file...");
    }

    protected void closeFile() {
        System.out.println("Closing file...");
    }

    protected void sendReport() {
        System.out.println("Sending report to management...");
    }

    // Steps that must be implemented by subclasses
    protected abstract void extractData();
    protected abstract void parseData();

    // Hook method that can be overridden
    protected void analyzeData() {
        System.out.println("Performing basic data analysis...");
    }

}
