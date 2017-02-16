package com.gthub.williamg.myapplication.callback;

import android.util.Log;


import com.gthub.williamg.myapplication.dto.LiveStreamPojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StreamStatusCallback implements Callback<LiveStreamPojo> {

    private String TAG = "StreamStatusCallback ->";

    @Override
    public void onResponse(Call<LiveStreamPojo> call, Response<LiveStreamPojo> response) {
        if (response.body() != null) {
            if (response.body().getLiveStream() != null)
                Log.d(TAG, "onResponse: State: " + response.body().getLiveStream().getState());
            if (response.body().getMeta() != null)
                Log.d(TAG, "onResponse: State: " + response.body().getMeta().getMessage());
        }
    }

    @Override
    public void onFailure(Call<LiveStreamPojo> call, Throwable t) {
        Log.e(TAG, "onFailure: error: ", t);
    }
}
