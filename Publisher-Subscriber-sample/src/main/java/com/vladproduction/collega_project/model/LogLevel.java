package com.vladproduction.collega_project.model;


import com.vladproduction.collega_project.subscriber.*;

public enum LogLevel {
    INFO(new SubscriberInfo()),

    WARN(new SubscriberWarning()),

    DEBUGGING(new SubscriberDebug()),

    TRACE(new SubscriberTrace()),

    ERROR(new SubscriberError());

    private final Subscriber subscriber;

    LogLevel(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }
}
