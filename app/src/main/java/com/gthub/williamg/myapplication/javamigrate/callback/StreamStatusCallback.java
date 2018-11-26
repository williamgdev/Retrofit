package com.gthub.williamg.myapplication.javamigrate.callback;

import android.util.Log;


import com.gthub.williamg.myapplication.javamigrate.dto.LiveStreamResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StreamStatusCallback implements Callback<LiveStreamResponse> {

    private String TAG = "StreamStatusCallback ->";

    @Override
    public void onResponse(Call<LiveStreamResponse> call, Response<LiveStreamResponse> response) {
        if (response.body() != null) {
            if (response.body().getLiveStream() != null)
                Log.d(TAG, "onResponse: State: " + response.body().getLiveStream().getState());
            if (response.body().getMeta() != null)
                Log.d(TAG, "onResponse: State: " + response.body().getMeta().getMessage());
        }
    }

    @Override
    public void onFailure(Call<LiveStreamResponse> call, Throwable t) {
        Log.e(TAG, "onFailure: error: ", t);
    }
}
