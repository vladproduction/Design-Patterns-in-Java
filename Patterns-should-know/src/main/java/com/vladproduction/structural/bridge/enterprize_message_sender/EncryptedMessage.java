package com.vladproduction.structural.bridge.enterprize_message_sender;

public class EncryptedMessage extends Message {

    private String content;

    public EncryptedMessage(MessageSender messageSender, String content) {
        super(messageSender);
        this.content = content;
    }

    @Override
    public void sendMessage(String recipient) {
        String encryptedContent = encrypt(this.content);
        messageSender.sendMessage("ENCRYPTED: " + recipient, encryptedContent);

    }

    private String encrypt(String content) {
        //demo encrypting
        StringBuilder encrypted = new StringBuilder();
        for (char c : content.toCharArray()) {
            encrypted.append((char) (c + 1));
        }
        return encrypted.toString();
    }

}
