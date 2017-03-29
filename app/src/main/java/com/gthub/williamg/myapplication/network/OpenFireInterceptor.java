package com.gthub.williamg.myapplication.network;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class OpenFireInterceptor implements Interceptor {
    private String authorization = "Basic YWRtaW46cmFuZHBhc3Mx";

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

    public static OkHttpClient buildHttpClient(){
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient().newBuilder();
        httpClientBuilder.addInterceptor(new OpenFireInterceptor());

        return httpClientBuilder.build();
    }
}
