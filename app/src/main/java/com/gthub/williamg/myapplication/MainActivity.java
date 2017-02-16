package com.gthub.williamg.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL = "https://api.cloud.wowza.com/api/v1/";
    private static final String STREAM_ID = "c95cdq";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkHttpClient.Builder httpClientBuilder = new OkHttpClient().newBuilder();
        httpClientBuilder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request()
                        .newBuilder()
                        .addHeader("wsc-api-key", "api-key-example")
                        .addHeader("wsc-access-key", "acces-key-example")
                        .build();
                return chain.proceed(request);
            }
        });

        OkHttpClient httpClient = httpClientBuilder.build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();

        ApiService apiService = retrofit.create(ApiService.class);
        apiService.getLiveStreamStatus(STREAM_ID)
                .enqueue(new StreamStatusCallback());


    }
}
