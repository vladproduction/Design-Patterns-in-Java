package com.vladproduction.structural.bridge.enterprize_message_sender;

// abstraction class with Message Sender
public abstract class Message {

    protected MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void sendMessage(String recipient);
}
