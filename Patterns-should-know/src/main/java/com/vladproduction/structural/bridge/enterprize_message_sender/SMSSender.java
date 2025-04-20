package com.vladproduction.structural.bridge.enterprize_message_sender;

public class SMSSender implements MessageSender{

    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending sms to "+recipient + ": "+message);
    }
}
