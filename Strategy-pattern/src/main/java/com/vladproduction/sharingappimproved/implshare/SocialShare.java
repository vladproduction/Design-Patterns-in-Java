package com.vladproduction.sharingappimproved.implshare;

import com.vladproduction.sharingappimproved.ShareStrategy;
import com.vladproduction.sharingappimproved.exceptions.ShareException;

import java.util.Map;

public class SocialShare implements ShareStrategy {
    @Override
    public void share(String content, Map<String, String> metadata) throws ShareException {

        if(content == null || content.isEmpty()){
            throw new ShareException("Content can not be empty");
        }
        String platform = metadata.getOrDefault("platform", "");
        if(platform.isEmpty()){
            throw new ShareException("Social platform is required");
        }
        System.out.println("Sharing on " + platform + ": " + content);
    }
}
