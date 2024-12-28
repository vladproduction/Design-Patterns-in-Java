package com.vladproduction.sharingappimproved;

import com.vladproduction.sharingappimproved.exceptions.ShareException;

import java.util.Map;

public interface ShareStrategy {

    void share(String content, Map<String, String> metadata) throws ShareException;

}
