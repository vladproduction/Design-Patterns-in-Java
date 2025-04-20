package com.vladproduction.structural.facade;

// Facade
public class ComputerFacade {

    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("Computer starting...");
        cpu.freeze();
        memory.load(0, hardDrive.read(0, 1024));
        cpu.jump(0);
        cpu.execute();
        System.out.println("Computer started successfully");
    }

    public void shutdown() {
        System.out.println("Computer shutting down...");
        // complex shutdown operations
        System.out.println("Computer shut down successfully");
    }
}
