package com.vladproduction.structural.bridge.enterprize_message_sender;

public class WhatsAppSender implements MessageSender{

    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending WhatsApp message to " + recipient + ": " + message);
    }

}
