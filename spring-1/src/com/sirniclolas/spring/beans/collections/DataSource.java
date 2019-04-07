package com.sirniclolas.spring.beans.collections;

import java.util.Properties;

public class DataSource {
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }
}
