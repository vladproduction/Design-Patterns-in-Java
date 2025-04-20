package com.vladproduction.structural.bridge.enterprize_message_sender;

public class EmailSender implements MessageSender{

    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending email to "+recipient + ": "+message);
    }
}
