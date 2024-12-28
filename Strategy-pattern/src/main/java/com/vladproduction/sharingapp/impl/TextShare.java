package com.vladproduction.sharingapp.impl;

import com.vladproduction.sharingapp.ShareStrategy;

public class TextShare implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("TextShare");
    }
}
