package com.vladproduction.creational.prototype.real_example;

//Client code
public class DocumentPrototypeDemo {
    public static void main(String[] args) {

        //create documents from templates
        Document pdfAnnualReport = DocumentFactory.createPDFDocument("PDF Annual Report");
        pdfAnnualReport.addContent("Financial Summary");
        pdfAnnualReport.addContent("Revenue Forecast");

        Document docxLetter = DocumentFactory.createDOCXDocument("Business Letter");
        docxLetter.addContent("Dear Sir/Madam");
        docxLetter.addContent("I am writing to inform you...");

        Document txtNotes = DocumentFactory.createTXTDocument("Meeting Notes");
        txtNotes.addContent("Participants: John, Mary, David");
        txtNotes.addContent("Action items: Research new markets");

        //print documents
        System.out.println(pdfAnnualReport);
        System.out.println(docxLetter);
        System.out.println(txtNotes);

        //clone an existing document to create a similar one
        Document pdfReportCopy = pdfAnnualReport.clone();
        pdfReportCopy.setTitle("Annual Report - Executive Summary");
        pdfReportCopy.addContent("Key Performance Indicators");

        System.out.println("Original document:");
        System.out.println(pdfAnnualReport);

        System.out.println("Cloned and modified document:");
        System.out.println(pdfReportCopy);

    }
}
