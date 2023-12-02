package com.vladproduction.collega_project.publisher;


import com.vladproduction.collega_project.model.LogLevel;
import com.vladproduction.collega_project.model.Message;
import com.vladproduction.collega_project.subscriber.Subscriber;

public interface Publisher {

    void subscribe(
            LogLevel level,
            Subscriber... subscribers);

    void unsubscribe(
            LogLevel level,
            Subscriber subscriber);

    void publish(
            LogLevel level,
            Message message);

    boolean containsSubscriber(
            LogLevel logLevel,
            Subscriber subscriber);
}
