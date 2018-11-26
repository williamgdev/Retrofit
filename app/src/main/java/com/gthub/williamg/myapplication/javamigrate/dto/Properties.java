package com.gthub.williamg.myapplication.javamigrate.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;

import java.util.List;

public class Properties {

    @ElementList(inline=true)
    private List<Property> property;

    public List<Property> getProperty ()
    {
        return property;
    }

    public void setProperty (List<Property> property)
    {
        this.property = property;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [property = "+property+"]";
    }
}
