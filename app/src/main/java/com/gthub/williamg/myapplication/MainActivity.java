package com.gthub.williamg.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gthub.williamg.myapplication.callback.EmptyCallback;
import com.gthub.williamg.myapplication.callback.StreamStatusCallback;
import com.gthub.williamg.myapplication.callback.UserCallback;
import com.gthub.williamg.myapplication.dto.UserRequest;
import com.gthub.williamg.myapplication.network.ServiceFactory;
import com.gthub.williamg.myapplication.restservice.ApiService;
import com.gthub.williamg.myapplication.restservice.OpenFireApiService;


public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL_OPENFIRE_API = "http://localhost:9090/app/v1/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ApiService apiService = ServiceFactory.createAPiService();
//        apiService.startLiveStream(ServiceFactory.STREAM_ID).enqueue(new StreamStatusCallback());
        apiService.stopLiveStream(ServiceFactory.STREAM_ID).enqueue(new StreamStatusCallback());

        OpenFireApiService apiService2 = ServiceFactory.createOpenFireAPIService(BASE_URL_OPENFIRE_API);
        apiService2.getUser("admin").enqueue(new UserCallback());
        UserRequest userRequest = new UserRequest("user1", "passwd1");
        apiService2.createUser(userRequest).enqueue(new EmptyCallback());

    }
}
