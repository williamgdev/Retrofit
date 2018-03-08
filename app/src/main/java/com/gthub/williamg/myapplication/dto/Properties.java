package com.gthub.williamg.myapplication.dto;

import org.simpleframework.xml.Attribute;

class Properties {
    @Attribute(name = "keyname", required = false)
    private String keyName;

    @Attribute(name = "anotherkey", required = false)
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
