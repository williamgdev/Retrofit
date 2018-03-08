package com.gthub.williamg.myapplication.callback;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EmptyCallback implements Callback<Void> {
    private static final String TAG = "EmptyCallback ->";

    @Override
    public void onResponse(Call<Void> call, Response<Void> response) {
        switch (response.code()){
            case 201:
                Log.d(TAG, "onResponse: OK");
                break;

            default:
                Log.d(TAG, "onResponse: " + response.code());
                break;
        }
    }

    @Override
    public void onFailure(Call<Void> call, Throwable t) {
        Log.d(TAG, "onFailure: " + t.getMessage());
    }
}
