package com.gthub.williamg.myapplication.network;

import android.content.Context;

import com.gthub.williamg.myapplication.R;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class OpenFireInterceptor implements Interceptor {
    public static String authorization;

    @Override
    public Response intercept(Chain chain) throws IOException {
        return chain.proceed(createRequest(chain));
    }

    public Request createRequest(Chain chain) {
        return chain.request()
                .newBuilder()
                .addHeader("Authorization", authorization)
                .build();
    }

    public static OkHttpClient buildHttpClient(Context context){
        authorization = context.getString(R.string.openfire_key);
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient().newBuilder();
        httpClientBuilder.addInterceptor(new OpenFireInterceptor());

        return httpClientBuilder.build();
    }
}
