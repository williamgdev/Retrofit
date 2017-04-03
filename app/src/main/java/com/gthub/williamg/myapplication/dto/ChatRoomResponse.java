package com.gthub.williamg.myapplication.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name="chatRooms", strict = false)
public class ChatRoomResponse  extends BaseResponse{
    @ElementList(inline=true)
    private List<ChatRoom> chatRooms;

    public List<ChatRoom> getChatRooms() {
        return chatRooms;
    }

    public void setChatRooms(List<ChatRoom> chatRooms) {
        this.chatRooms = chatRooms;
    }

    @Override
    public String toString() {
        return "ClassPojo [chatRooms = " + chatRooms + "]";
    }
}
