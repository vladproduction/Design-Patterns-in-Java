package com.vladproduction.structural.proxy.protection_proxy_example;

// Proxy with access control
public class ProtectionProxyDocument implements Document {

    private RealDocument realDocument;
    private final String user;
    private final String documentName;

    public ProtectionProxyDocument(String documentName, String user) {
        this.documentName = documentName;
        this.user = user;
    }

    // Helper method to check if the user is an admin
    private boolean isAdmin() {
        return "admin".equals(user);
    }

    // Helper method to ensure the real document is created
    private void ensureRealDocumentCreated() {
        if (realDocument == null) {
            realDocument = new RealDocument(documentName);
        }
    }

    @Override
    public void view() {
        ensureRealDocumentCreated();
        System.out.println("User " + user + " is accessing document");
        realDocument.view();
    }

    @Override
    public void edit() {
        if (isAdmin()) {
            ensureRealDocumentCreated();
            System.out.println("User " + user + " is editing document");
            realDocument.edit();
        } else {
            System.out.println("Access denied: User " + user + " is not authorized to edit documents");
        }
    }

}
