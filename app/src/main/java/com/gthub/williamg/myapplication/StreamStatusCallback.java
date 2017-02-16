package com.gthub.williamg.myapplication;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by wgutierrez on 2/16/17.
 */
public class StreamStatusCallback implements Callback<StreamStatus> {

    private String TAG = "StreamStatusCallback ->";

    @Override
    public void onResponse(Call<StreamStatus> call, Response<StreamStatus> response) {
        Log.d(TAG, "onResponse: State: " + response.body().getLiveStream().getState());
        if (response.body().getMeta() != null)
            Log.d(TAG, "onResponse: State: " + response.body().getMeta().getMessage());
    }

    @Override
    public void onFailure(Call<StreamStatus> call, Throwable t) {
        Log.e(TAG, "onFailure: error: ", t);
    }
}
