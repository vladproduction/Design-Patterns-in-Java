package com.vladproduction.sharingapp.impl;

import com.vladproduction.sharingapp.ShareStrategy;

public class EmailShare implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("EmailShare");
    }
}
