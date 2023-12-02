package com.vladproduction.collega_project.subscriber;


import com.vladproduction.collega_project.model.Message;

import static com.vladproduction.collega_project.model.LogLevel.TRACE;

public class SubscriberTrace
        implements Subscriber {

    private boolean isReceived;

    @Override
    public void receive(Message message) {
        System.out.printf("\u001B[37mLevel#%s, message: %s%n",
                          getId(),
                          message);
        isReceived = true;
    }

    @Override
    public Integer getId() {
        return TRACE.ordinal();
    }

    @Override
    public boolean hasReceived() {
        return isReceived;
    }
}
