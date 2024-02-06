package org.vladproduction.configUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperty {

    public static String getConfigProperty(String key) {

        try (InputStream in = ConfigProperty.class.getResourceAsStream("/app.properties")) {
            Properties properties = new Properties();
            properties.load(in);
            String value = properties.getProperty(key);
            return value;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
