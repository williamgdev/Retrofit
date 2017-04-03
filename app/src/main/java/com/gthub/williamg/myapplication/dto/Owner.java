package com.gthub.williamg.myapplication.dto;

import org.simpleframework.xml.Text;

class Owner {
    @Text
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text = "+ text +"]";
    }
}