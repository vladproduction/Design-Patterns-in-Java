package com.vladproduction.structural.proxy.protection_proxy_example;

// Client code
public class ProtectionProxyDemo {
    public static void main(String[] args) {

        //Create documents with different users
        Document documentForUser = new ProtectionProxyDocument("user_report.docx", "user");
        Document documentForAdmin = new ProtectionProxyDocument("admin_report.docx", "admin");

        // User operations
        System.out.println("User attempting to view document:");
        documentForUser.view();  // This should work

        System.out.println("\nUser attempting to edit document:");
        documentForUser.edit();  // This should be denied

        // Admin operations
        System.out.println("\nAdmin attempting to view document:");
        documentForAdmin.view();  // This should work

        System.out.println("\nAdmin attempting to edit document:");
        documentForAdmin.edit();  // This should work

    }
}
