package com.gthub.williamg.myapplication.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="user", strict = false)
public class UserRequest {
    @Element(name = "username")
    private String username;
    @Element(name = "password")
    private String password;
    @Element(name = "properties", required = false)
    private Properties properties;

    public UserRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}

