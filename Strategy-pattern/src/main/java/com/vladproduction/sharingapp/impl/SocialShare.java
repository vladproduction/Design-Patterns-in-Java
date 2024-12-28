package com.vladproduction.sharingapp.impl;

import com.vladproduction.sharingapp.ShareStrategy;

public class SocialShare implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("SocialShare");
    }
}
