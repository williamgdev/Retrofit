package com.gthub.williamg.myapplication.javamigrate.dto;

import org.simpleframework.xml.ElementList;

import java.util.List;

class BroadcastPresenceRoles {

    @ElementList(inline=true)
    List<BroadcastPresenceRole> broadcastPresenceRoles1;

    public List<BroadcastPresenceRole> getBroadcastPresenceRoles() {
        return broadcastPresenceRoles1;
    }

    public void setBroadcastPresenceRoles(List<BroadcastPresenceRole> broadcastPresenceRoles) {
        this.broadcastPresenceRoles1 = broadcastPresenceRoles;
    }
}
