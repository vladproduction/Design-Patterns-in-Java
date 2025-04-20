package com.vladproduction.structural.bridge.enterprize_message_sender;

public class UrgentMessage extends Message {

    private String content;

    public UrgentMessage(MessageSender messageSender, String content) {
        super(messageSender);
        this.content = content;
    }

    @Override
    public void sendMessage(String recipient) {
        messageSender.sendMessage("URGENT: " + content, recipient);
    }
}
