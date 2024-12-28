package com.vladproduction.sharingapp;

public abstract class PhoneCameraAppAbstract {

    private ShareStrategy shareStrategy;

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    public void take(){
        System.out.println("take");
    }

    public void save(){
        System.out.println("save");
    }

    public void share(){
        System.out.println("share");
    }

    public abstract void edit();


}
