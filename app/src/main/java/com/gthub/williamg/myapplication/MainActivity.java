package com.gthub.williamg.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.gthub.williamg.myapplication.dto.UserRequest;
import com.gthub.williamg.myapplication.dto.UserResponse;
import com.gthub.williamg.myapplication.model.Channel;
import com.gthub.williamg.myapplication.network.OpenFireManager;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL_OPENFIRE_API = "http://ec2-54-234-60-142.compute-1.amazonaws.com:9090/plugins/restapi/v1/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        WowzaApiService apiService = OpenFireManager.createAPiService(this);
//        apiService.startLiveStream(OpenFireManager.STREAM_ID).enqueue(new StreamStatusCallback());
//        apiService.stopLiveStream(OpenFireManager.STREAM_ID).enqueue(new StreamStatusCallback());

        OpenFireManager apiService2 = OpenFireManager.getInstance(BASE_URL_OPENFIRE_API, this);
        apiService2.getUser("admin", new OpenFireManager.OpenFireManagerListener<UserResponse>() {
            @Override
            public void onSuccess(UserResponse result) {
                showText(result.getEmail());
            }

            @Override
            public void onError(String text) {
                showText(text);
            }
        });

        UserRequest userRequest = new UserRequest("user1", "passwd1");
        apiService2.createUser(userRequest, new OpenFireManager.OpenFireManagerListener<Boolean>(){
            @Override
            public void onSuccess(Boolean result) {
                showText(result ? "User created successful" : "User already exist");
            }

            @Override
            public void onError(String text) {
                showText(text);
            }
        });
        apiService2.getChatRooms("conference", new OpenFireManager.OpenFireManagerListener<List<Channel>>() {
            @Override
            public void onSuccess(List<Channel> result) {
                showText(result.size() + "");
            }

            @Override
            public void onError(String text) {
                showText(text);
            }
        });

    }

    private void showText(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
