package com.gthub.williamg.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gthub.williamg.myapplication.callback.StreamStatusCallback;
import com.gthub.williamg.myapplication.network.ServiceFactory;
import com.gthub.williamg.myapplication.restservice.ApiService;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL = "https://api.cloud.wowza.com/api/v1/";
    private static final String STREAM_ID = "c9jf5cdq";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ApiService apiService = ServiceFactory.createAPiService();
//        apiService.startLiveStream(ServiceFactory.STREAM_ID).enqueue(new StreamStatusCallback());
        apiService.stopLiveStream(ServiceFactory.STREAM_ID).enqueue(new StreamStatusCallback());

    }
}
