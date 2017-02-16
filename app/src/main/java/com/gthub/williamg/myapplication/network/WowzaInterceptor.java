package com.gthub.williamg.myapplication.network;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WowzaInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request()
                .newBuilder()
                .addHeader("wsc-api-key", "hBp76TIjgGJqUKaJkTfmdZ4EHAEKcA3GRQDfM2n2eFrDbjTBLnidstk2jS56321c")
                .addHeader("wsc-access-key", "y0hsLVdvjFemqJnIRodyhsvRXurULfDxEzgivUg41ZAwIVwBeOzppA1C7cfP375e")
                .build();
        return chain.proceed(request);
    }

    public static OkHttpClient buildHttpClient(){
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient().newBuilder();
        httpClientBuilder.addInterceptor(new WowzaInterceptor());

        return httpClientBuilder.build();
    }
}

