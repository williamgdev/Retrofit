package com.gthub.williamg.myapplication.javamigrate.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "owners")
public class Owners {
    @ElementList(inline = true)
    private List<Owner> owners;

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }
}

