package com.gthub.williamg.myapplication.callback;

import android.util.Log;

import com.gthub.williamg.myapplication.dto.ChatRoomResponse;
import com.gthub.williamg.myapplication.model.Channel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChatRoomCallback implements Callback<ChatRoomResponse> {
    private static final String TAG = "ChatRoomCallback ->";
    ChatRoomCallbackListener listener;

    public ChatRoomCallback(ChatRoomCallbackListener listener) {
        this.listener = listener;
    }

    @Override
    public void onResponse(Call<ChatRoomResponse> call, Response<ChatRoomResponse> response) {
        switch (response.code()){
            case 200:
                if (response.body().getChatRooms() != null)
                    listener.notifyChatRoomResponse(Channel.create(response.body().getChatRooms()));
                break;
            default:
                Log.d(TAG, "onResponse: " + response.code());
                break;
        }
    }

    @Override
    public void onFailure(Call<ChatRoomResponse> call, Throwable t) {
        Log.d(TAG, "onResponse: ");

    }
    public interface ChatRoomCallbackListener{
        void notifyChatRoomResponse(List<Channel> channels);
    }
}
