package com.vladproduction.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        // Create receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Fan ceilingFan = new Fan();

        // Create commands
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command fanStart = new FanStartCommand(ceilingFan);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Execute commands
        remote.setCommand(livingRoomLightOn);
        remote.pressButton();

        remote.setCommand(kitchenLightOn);
        remote.pressButton();

        remote.setCommand(fanStart);
        remote.pressButton();

        // Undo last command (fan start)
        remote.pressUndoButton();

        remote.setCommand(livingRoomLightOff);
        remote.pressButton();
    }
}
