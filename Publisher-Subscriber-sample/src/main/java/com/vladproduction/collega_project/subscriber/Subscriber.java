package com.vladproduction.collega_project.subscriber;


import com.vladproduction.collega_project.model.Message;

public interface Subscriber {

    void receive(Message message);

    Integer getId();

    boolean hasReceived();
}
