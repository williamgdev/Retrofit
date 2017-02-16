package com.gthub.williamg.myapplication.network;

import com.gthub.williamg.myapplication.restservice.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceFactory {
    private static final String BASE_URL = "https://api.cloud.wowza.com/api/v1/";
    public static final String STREAM_ID = "c9jf5cdq";

    public static ApiService createAPiService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(WowzaInterceptor.buildHttpClient())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);

        return apiService;

    }
}
