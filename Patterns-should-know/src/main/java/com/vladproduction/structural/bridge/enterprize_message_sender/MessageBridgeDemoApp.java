package com.vladproduction.structural.bridge.enterprize_message_sender;

public class MessageBridgeDemoApp {
    public static void main(String[] args) {

        // Create different message senders
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();
        MessageSender whatsAppSender = new WhatsAppSender();

        // Create different message types with different senders
        Message simpleEmailMessage = new SimpleMessage(emailSender, "Hello! This is a simple email message");
        Message encryptedSmsMessage = new EncryptedMessage(smsSender, "Top secret message");
        Message urgentWhatsAppMessage = new UrgentMessage(whatsAppSender, "Please call me ASAP!");

        // Send messages
        simpleEmailMessage.sendMessage("alice@example.com");
        encryptedSmsMessage.sendMessage("+1-555-123-4567");
        urgentWhatsAppMessage.sendMessage("+1-555-987-6543");

        // Change implementations dynamically
        Message urgentEmail = new UrgentMessage(emailSender, "Meeting rescheduled to today!");
        urgentEmail.sendMessage("team@example.com");

    }
}
