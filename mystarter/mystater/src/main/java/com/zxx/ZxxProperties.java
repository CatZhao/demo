package com.zxx;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.zxx")
public class ZxxProperties {
    private String name = "zxx";

    public String getName() {
        return name;
    }

    public ZxxProperties setName(String name) {
        this.name = name;
        return this;
    }
}
