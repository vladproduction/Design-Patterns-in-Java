package com.vladproduction.behavioral.template;

public class DatabaseDataMiner extends DataMiner {

    @Override
    protected void openFile() {
        System.out.println("Connecting to database...");
    }

    @Override
    protected void extractData() {
        System.out.println("Executing SQL query...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing result set...");
    }

    @Override
    protected void closeFile() {
        System.out.println("Closing database connection...");
    }

}
