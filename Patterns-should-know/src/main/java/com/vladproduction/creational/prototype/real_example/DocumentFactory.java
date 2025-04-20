package com.vladproduction.creational.prototype.real_example;

import static com.vladproduction.creational.prototype.real_example.DocumentFormat.*;

// DocumentFactory that uses the Prototype pattern
public class DocumentFactory {

    private static final Document PDF_TEMPLATE;
    private static final Document DOCX_TEMPLATE;
    private static final Document TXT_TEMPLATE;

    static {
        // Initialize with expensive operations
        PDF_TEMPLATE = new Document("PDF #1", "Author A", PDF);
        DOCX_TEMPLATE = new Document("DOCX #2", "Author B", DOCX);
        TXT_TEMPLATE = new Document("TXT #3", "Author C", TXT);

        //in each we have to add some content:
        PDF_TEMPLATE.addContent("PDF Header");
        PDF_TEMPLATE.addContent("PDF Footer");

        DOCX_TEMPLATE.addContent("DOCX Default style");
        DOCX_TEMPLATE.addContent("DOCX Page setup");

        TXT_TEMPLATE.addContent("TXT Plain Format");
    }

    public static Document createPDFDocument(String title) {
        Document pdf = PDF_TEMPLATE.clone();
        pdf.setTitle(title);
        return pdf;
    }

    public static Document createDOCXDocument(String title) {
        Document docx = DOCX_TEMPLATE.clone();
        docx.setTitle(title);
        return docx;
    }

    public static Document createTXTDocument(String title) {
        Document docx = TXT_TEMPLATE.clone();
        docx.setTitle(title);
        return docx;
    }



}
