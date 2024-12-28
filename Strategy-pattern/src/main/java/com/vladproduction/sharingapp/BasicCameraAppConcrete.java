package com.vladproduction.sharingapp;

public class BasicCameraAppConcrete extends PhoneCameraAppAbstract{

    @Override
    public void edit() {
        System.out.println("edit: BasicCameraAppConcrete");
    }
    @Override
    public void take() {
        System.out.println("take: BasicCameraAppConcrete");
    }

    @Override
    public void save() {
        System.out.println("save: BasicCameraAppConcrete");
    }

    @Override
    public void share() {
        System.out.println("share: BasicCameraAppConcrete");
    }
}
