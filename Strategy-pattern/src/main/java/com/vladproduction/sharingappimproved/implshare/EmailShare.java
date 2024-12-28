package com.vladproduction.sharingappimproved.implshare;

import com.vladproduction.sharingappimproved.ShareStrategy;
import com.vladproduction.sharingappimproved.exceptions.ShareException;

import java.util.Map;

public class EmailShare implements ShareStrategy {
    @Override
    public void share(String content, Map<String, String> metadata) throws ShareException {

        if(content == null || content.isEmpty()){
            throw new ShareException("Content can not be empty");
        }
        String recipient = metadata.getOrDefault("recipient", "");
        if(recipient.isEmpty()){
            throw new ShareException("Email recipient required");
        }
        System.out.println("Sharing via Email to " + recipient + ": " + content);
    }
}
