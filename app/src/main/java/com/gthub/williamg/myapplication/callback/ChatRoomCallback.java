package com.gthub.williamg.myapplication.callback;

import android.util.Log;

import com.gthub.williamg.myapplication.dto.ChatRoomResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChatRoomCallback implements Callback<ChatRoomResponse> {
    private static final String TAG = "ChatRoomCallback ->";

    @Override
    public void onResponse(Call<ChatRoomResponse> call, Response<ChatRoomResponse> response) {
        switch (response.code()){
            case 200:
                Log.d(TAG, "onResponse: OK");
                break;
            default:
                break;
        }
    }

    @Override
    public void onFailure(Call<ChatRoomResponse> call, Throwable t) {
        Log.d(TAG, "onResponse: ");

    }
}
