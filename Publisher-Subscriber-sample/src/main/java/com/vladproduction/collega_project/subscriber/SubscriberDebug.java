package com.vladproduction.collega_project.subscriber;


import com.vladproduction.collega_project.model.Message;

import static com.vladproduction.collega_project.model.LogLevel.DEBUGGING;
import static java.lang.System.Logger.Level.DEBUG;

public class SubscriberDebug
        implements Subscriber {

    private boolean isReceived;

    @Override
    public void receive(Message message) {
        System.out.printf("\u001B[36mLevel#%s, message: %s%n",
                          getId(),
                          message);
        isReceived = true;
    }

    @Override
    public Integer getId() {
        return DEBUGGING.ordinal();
    }

    @Override
    public boolean hasReceived() {
        return isReceived;
    }
}
