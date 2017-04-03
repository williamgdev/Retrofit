package com.gthub.williamg.myapplication.dto;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "chatRoom")
public class ChatRoom {
    @Element(name = "loginRestrictedToNickname", required = false)
    private String loginRestrictedToNickname;
    @Element(name = "broadcastPresenceRoles", required = false)
    private BroadcastPresenceRoles broadcastPresenceRoles;
    @Element(name = "subject", required = false)
    private String subject;
    @Element(name = "naturalName", required = false)
    private String naturalName;
    @Element(name = "canAnyoneDiscoverJID", required = false)
    private String canAnyoneDiscoverJID;
    @Element(name = "ownerGroups", required = false)
    private String ownerGroups;
    @Element(name = "membersOnly", required = false)
    private String membersOnly;
    @Element(name = "canChangeNickname", required = false)
    private String canChangeNickname;
    @Element(name = "admins", required = false)
    private String admins;
    @Element(name = "outcasts", required = false)
    private String outcasts;
    @Element(name = "logEnabled", required = false)
    private String logEnabled;
    @Element(name = "canOccupantsInvite", required = false)
    private String canOccupantsInvite;
    @Element(name = "outcastGroups", required = false)
    private String outcastGroups;
    @Element(name = "creationDate", required = false)
    private String creationDate;
    @Element(name = "adminGroups", required = false)
    private String adminGroups;
    @Element(name = "moderated", required = false)
    private String moderated;
    @Element(name = "persistent", required = false)
    private String persistent;
    @Element(name = "canOccupantsChangeSubject", required = false)
    private String canOccupantsChangeSubject;
    @Element(name = "maxUsers", required = false)
    private String maxUsers;
    @Element(name = "roomName", required = false)
    private String roomName;
    @Element(name = "registrationEnabled", required = false)
    private String registrationEnabled;
    @Element(name = "description", required = false)
    private String description;
    @Element(name = "memberGroups", required = false)
    private String memberGroups;
    @Element(name = "modificationDate", required = false)
    private String modificationDate;
    @Element(name = "owners", required = false)
    private Owners owners;
    @ElementList(required = false)
    private List<String> members;
    @Element(name = "publicRoom", required = false)
    private String publicRoom;

    public String getLoginRestrictedToNickname() {
        return loginRestrictedToNickname;
    }

    public void setLoginRestrictedToNickname(String loginRestrictedToNickname) {
        this.loginRestrictedToNickname = loginRestrictedToNickname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNaturalName() {
        return naturalName;
    }

    public void setNaturalName(String naturalName) {
        this.naturalName = naturalName;
    }

    public String getCanAnyoneDiscoverJID() {
        return canAnyoneDiscoverJID;
    }

    public void setCanAnyoneDiscoverJID(String canAnyoneDiscoverJID) {
        this.canAnyoneDiscoverJID = canAnyoneDiscoverJID;
    }

    public String getOwnerGroups() {
        return ownerGroups;
    }

    public void setOwnerGroups(String ownerGroups) {
        this.ownerGroups = ownerGroups;
    }

    public String getMembersOnly() {
        return membersOnly;
    }

    public void setMembersOnly(String membersOnly) {
        this.membersOnly = membersOnly;
    }

    public String getCanChangeNickname() {
        return canChangeNickname;
    }

    public void setCanChangeNickname(String canChangeNickname) {
        this.canChangeNickname = canChangeNickname;
    }

    public String getAdmins() {
        return admins;
    }

    public void setAdmins(String admins) {
        this.admins = admins;
    }

    public String getOutcasts() {
        return outcasts;
    }

    public void setOutcasts(String outcasts) {
        this.outcasts = outcasts;
    }

    public String getLogEnabled() {
        return logEnabled;
    }

    public void setLogEnabled(String logEnabled) {
        this.logEnabled = logEnabled;
    }

    public String getCanOccupantsInvite() {
        return canOccupantsInvite;
    }

    public void setCanOccupantsInvite(String canOccupantsInvite) {
        this.canOccupantsInvite = canOccupantsInvite;
    }

    public String getOutcastGroups() {
        return outcastGroups;
    }

    public void setOutcastGroups(String outcastGroups) {
        this.outcastGroups = outcastGroups;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getAdminGroups() {
        return adminGroups;
    }

    public void setAdminGroups(String adminGroups) {
        this.adminGroups = adminGroups;
    }

    public String getModerated() {
        return moderated;
    }

    public void setModerated(String moderated) {
        this.moderated = moderated;
    }

    public String getPersistent() {
        return persistent;
    }

    public void setPersistent(String persistent) {
        this.persistent = persistent;
    }

    public String getCanOccupantsChangeSubject() {
        return canOccupantsChangeSubject;
    }

    public void setCanOccupantsChangeSubject(String canOccupantsChangeSubject) {
        this.canOccupantsChangeSubject = canOccupantsChangeSubject;
    }

    public String getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(String maxUsers) {
        this.maxUsers = maxUsers;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRegistrationEnabled() {
        return registrationEnabled;
    }

    public void setRegistrationEnabled(String registrationEnabled) {
        this.registrationEnabled = registrationEnabled;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMemberGroups() {
        return memberGroups;
    }

    public void setMemberGroups(String memberGroups) {
        this.memberGroups = memberGroups;
    }

    public String getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    public BroadcastPresenceRoles getBroadcastPresenceRoles() {
        return broadcastPresenceRoles;
    }

    public void setBroadcastPresenceRoles(BroadcastPresenceRoles broadcastPresenceRoles) {
        this.broadcastPresenceRoles = broadcastPresenceRoles;
    }

    public Owners getOwners() {
        return owners;
    }

    public void setOwners(Owners owners) {
        this.owners = owners;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getPublicRoom() {
        return publicRoom;
    }

    public void setPublicRoom(String publicRoom) {
        this.publicRoom = publicRoom;
    }

    @Override
    public String toString() {
        return "ClassPojo [loginRestrictedToNickname = " + loginRestrictedToNickname + ", broadcastPresenceRoles = " + broadcastPresenceRoles + ", subject = " + subject + ", naturalName = " + naturalName + ", canAnyoneDiscoverJID = " + canAnyoneDiscoverJID + ", ownerGroups = " + ownerGroups + ", membersOnly = " + membersOnly + ", canChangeNickname = " + canChangeNickname + ", admins = " + admins + ", outcasts = " + outcasts + ", logEnabled = " + logEnabled + ", canOccupantsInvite = " + canOccupantsInvite + ", outcastGroups = " + outcastGroups + ", creationDate = " + creationDate + ", adminGroups = " + adminGroups + ", moderated = " + moderated + ", persistent = " + persistent + ", canOccupantsChangeSubject = " + canOccupantsChangeSubject + ", maxUsers = " + maxUsers + ", roomName = " + roomName + ", registrationEnabled = " + registrationEnabled + ", description = " + description + ", memberGroups = " + memberGroups + ", modificationDate = " + modificationDate + ", owners = " + owners + ", members = " + members + ", publicRoom = " + publicRoom + "]";
    }
}