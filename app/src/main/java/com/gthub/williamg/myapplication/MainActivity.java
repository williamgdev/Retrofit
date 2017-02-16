package com.gthub.williamg.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gthub.williamg.myapplication.callback.StreamStatusCallback;
import com.gthub.williamg.myapplication.network.ServiceFactory;
import com.gthub.williamg.myapplication.restservice.ApiService;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ApiService apiService = ServiceFactory.createAPiService();
//        apiService.startLiveStream(ServiceFactory.STREAM_ID).enqueue(new StreamStatusCallback());
        apiService.stopLiveStream(ServiceFactory.STREAM_ID).enqueue(new StreamStatusCallback());

    }
}
