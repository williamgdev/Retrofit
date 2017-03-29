package com.gthub.williamg.myapplication.callback;

import android.util.Log;

import com.gthub.williamg.myapplication.dto.UserResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserCallback implements Callback<UserResponse> {
    private static final String TAG = "UserCallBack ->";

    @Override
    public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
        switch (response.code()){
            case 200:
                if(response.body() != null) {
                    Log.d(TAG, "onResponse: " + response.body().getUsername());
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void onFailure(Call<UserResponse> call, Throwable t) {
        Log.d(TAG, "onFailure: Error" + t.getMessage());
    }
}
