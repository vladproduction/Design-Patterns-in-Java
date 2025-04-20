package com.vladproduction.structural.bridge.enterprize_message_sender;

public class SimpleMessage extends Message{

    private String content;

    public SimpleMessage(MessageSender messageSender, String content) {
        super(messageSender);
        this.content = content;
    }

    @Override
    public void sendMessage(String recipient) {
        messageSender.sendMessage(recipient, content);
    }
}
