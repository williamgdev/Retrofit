package com.gthub.williamg.myapplication.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="user")
public class UserResponse {

    @Element(name = "username")
    String username;

    @Element(name = "email")
    private String email;

    @Element(name = "name")
    private String name;

    @Element(name = "properties", required = false)
    private Properties properties;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ClassPojo [username = " + username + ", email = " + email + ", name = " + name + ", properties = " + properties + "]";
    }
}