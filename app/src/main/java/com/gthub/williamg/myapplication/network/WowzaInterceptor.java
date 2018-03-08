package com.gthub.williamg.myapplication.network;

import android.content.Context;

import com.gthub.williamg.myapplication.R;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WowzaInterceptor implements Interceptor {
    private static String API_KEY;
    private static String ACCESS_KEY;

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request()
                .newBuilder()
                .addHeader("wsc-api-key", API_KEY)
                .addHeader("wsc-access-key", ACCESS_KEY)
                .build();
        return chain.proceed(request);
    }

    public static OkHttpClient buildHttpClient(Context context){
        API_KEY = context.getString(R.string.wsc_api_key);
        ACCESS_KEY = context.getString(R.string.wsc_access_key);
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient().newBuilder();
        httpClientBuilder.addInterceptor(new WowzaInterceptor());

        return httpClientBuilder.build();
    }
}

