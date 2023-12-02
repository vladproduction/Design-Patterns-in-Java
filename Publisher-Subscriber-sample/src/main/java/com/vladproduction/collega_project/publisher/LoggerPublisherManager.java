package com.vladproduction.collega_project.publisher;


import com.vladproduction.collega_project.model.LogLevel;
import com.vladproduction.collega_project.model.Message;
import com.vladproduction.collega_project.subscriber.Subscriber;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

import static com.vladproduction.collega_project.model.LogLevel.*;

public class LoggerPublisherManager
        implements Publisher {

    private final EnumMap<LogLevel, Set<Subscriber>> levelSubscribers;

    public LoggerPublisherManager() {
        this.levelSubscribers = new EnumMap<>(LogLevel.class);
        for (LogLevel level : LogLevel.values()) {
            levelSubscribers.put(level, new HashSet<>());
        }
    }

    @Override
    public void subscribe(
            LogLevel level,
            Subscriber... subscribers) {
        Arrays.stream(subscribers)
              .forEach(subscriber -> levelSubscribers
                      .computeIfAbsent(level, k -> new HashSet<>())
                      .add(subscriber));
    }

    @Override
    public void unsubscribe(
            LogLevel level,
            Subscriber subscriber) {
        levelSubscribers.getOrDefault(level, new HashSet<>())
                .remove(subscriber);
    }

    @Override
    public void publish(LogLevel level, Message message) {
        levelSubscribers.getOrDefault(level, new HashSet<>())
                        .forEach(subscriber -> subscriber.receive(message));
    }

    public boolean containsSubscriber(LogLevel level, Subscriber subscriber) {
        return levelSubscribers.getOrDefault(level, new HashSet<>()).contains(subscriber);
    }



    public int getDebugLevel() {
        return DEBUGGING.ordinal() - WARN.ordinal() + INFO.ordinal();
    }
}
