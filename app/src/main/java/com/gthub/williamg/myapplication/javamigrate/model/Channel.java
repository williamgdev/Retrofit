package com.gthub.williamg.myapplication.javamigrate.model;

import java.util.ArrayList;
import java.util.List;

import com.gthub.williamg.myapplication.javamigrate.dto.ChatRoom;

public class Channel {
    private String name, streamName;

    public Channel(String name, String streamName) {
        this.name = name;
        this.streamName = streamName;
    }

    public Channel(ChatRoom chatRoom) {
        name = chatRoom.getNaturalName();
        streamName = chatRoom.getRoomName();
    }

    public String getName() {
        return name;
    }

    public String getStreamName() {
        return streamName;
    }

    public static List<Channel> create(List<ChatRoom> chatRooms) {
        List<Channel> channels = new ArrayList<>();
        for (ChatRoom chatRoom :
                chatRooms) {
            channels.add(new Channel(chatRoom));
        }
        return channels;

    }

}
