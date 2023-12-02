package com.vladproduction.collega_project.publisher;

public class PublisherFactory {
    private PublisherFactory() {
    }

    private static class SingletonHolder {
        private static final Publisher INSTANCE = new LoggerPublisherManager();
    }

    public static Publisher getPublisher() {
        return SingletonHolder.INSTANCE;
    }
}
