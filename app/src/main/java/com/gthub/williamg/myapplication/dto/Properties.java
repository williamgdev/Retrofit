package com.gthub.williamg.myapplication.dto;

import org.simpleframework.xml.Attribute;

class Properties {
    @Attribute(name = "keyname")
    private String keyName;

    @Attribute(name = "anotherkey")
    private long anotherKey;

    public String getKeyname() {
        return keyName;
    }

    public void setKeyname(String keyName) {
        this.keyName = keyName;
    }

    public long getAnotherKey() {
        return anotherKey;
    }

    public void setAnotherKey(long anotherKey) {
        this.anotherKey = this.anotherKey;
    }
}
