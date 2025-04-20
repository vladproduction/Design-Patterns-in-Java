package com.vladproduction.structural.facade;

public class HardDrive {

    public String read(long lba, int size) {
        System.out.println("HardDrive: Reading " + size + " bytes from LBA " + lba);
        return "Data from sector " + lba;
    }

}
