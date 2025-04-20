package com.vladproduction.behavioral.template;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        System.out.println("PDF Data Mining Process:");
        DataMiner pdfMiner = new PDFDataMiner();
        pdfMiner.mineData();

        System.out.println("\nCSV Data Mining Process:");
        DataMiner csvMiner = new CSVDataMiner();
        csvMiner.mineData();

        System.out.println("\nDatabase Data Mining Process:");
        DataMiner dbMiner = new DatabaseDataMiner();
        dbMiner.mineData();
    }
}
