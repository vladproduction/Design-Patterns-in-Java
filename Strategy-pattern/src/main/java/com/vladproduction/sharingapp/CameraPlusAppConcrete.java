package com.vladproduction.sharingapp;

public class CameraPlusAppConcrete extends PhoneCameraAppAbstract{

    @Override
    public void edit() {
        System.out.println("edit: CameraPlusAppConcrete");
    }
    @Override
    public void take() {
        System.out.println("take: CameraPlusAppConcrete");
    }

    @Override
    public void save() {
        System.out.println("save: CameraPlusAppConcrete");
    }

    @Override
    public void share() {
        System.out.println("share: CameraPlusAppConcrete");
    }
}
