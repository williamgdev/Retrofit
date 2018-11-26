package com.gthub.williamg.myapplication.javamigrate.network;

import android.content.Context;

import com.gthub.williamg.myapplication.javamigrate.restservice.WowzaApiService;
import com.gthub.williamg.myapplication.javamigrate.restservice.OpenFireApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class WowzaServiceFactory {
    private static final String BASE_URL = "https://api.cloud.wowza.com/api/v1/";
    public static final String STREAM_ID = "c9jf5cdq";

    public static WowzaApiService createAPiService(Context context){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(WowzaInterceptor.buildHttpClient(context))
                .build();

        WowzaApiService apiService = retrofit.create(WowzaApiService.class);

        return apiService;
    }

}
