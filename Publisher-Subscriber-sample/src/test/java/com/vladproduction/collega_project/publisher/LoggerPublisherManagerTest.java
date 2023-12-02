package com.vladproduction.collega_project.publisher;

import com.vladproduction.collega_project.model.Message;
import com.vladproduction.collega_project.subscriber.Subscriber;
import com.vladproduction.collega_project.subscriber.SubscriberInfo;
import org.junit.Test;

import static com.vladproduction.collega_project.model.LogLevel.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggerPublisherManagerTest {

    @Test
    public void testSubscribe() {
        LoggerPublisherManager loggerManager = new LoggerPublisherManager();
        Subscriber subscriber = new SubscriberInfo();
        loggerManager.subscribe(INFO, subscriber);
        assertTrue(loggerManager.containsSubscriber(INFO, subscriber));
    }

    @Test
    public void testUnsubscribe() {
        LoggerPublisherManager loggerManager = new LoggerPublisherManager();
        Subscriber subscriber = new SubscriberInfo();
        loggerManager.subscribe(INFO, subscriber);
        loggerManager.unsubscribe(INFO, subscriber);
        assertFalse(loggerManager.containsSubscriber(INFO, subscriber));
    }

    @Test
    public void testPublish() {
        LoggerPublisherManager loggerManager = new LoggerPublisherManager();
        Subscriber subscriber = new SubscriberInfo();
        Message message = new Message("Test Message");
        loggerManager.subscribe(INFO, subscriber);
        loggerManager.publish(INFO, message);
        assertTrue((subscriber).hasReceived());
    }

    @Test
    public void testGetDebugLevel() {
        LoggerPublisherManager loggerManager = new LoggerPublisherManager();
        int debugLevel = loggerManager.getDebugLevel();
        assertEquals(DEBUGGING.ordinal() - WARN.ordinal() + INFO.ordinal(),
                debugLevel);
    }

}
