package com.gthub.williamg.myapplication.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name="chatRooms", strict = false)
public class ChatRoomResponse  extends BaseResponse{
    @ElementList(inline=true)
    private List<ChatRoom> chatRoom;

    public List<ChatRoom> getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(List<ChatRoom> chatRoom) {
        this.chatRoom = chatRoom;
    }

    @Override
    public String toString() {
        return "ClassPojo [chatRoom = " + chatRoom + "]";
    }
}
