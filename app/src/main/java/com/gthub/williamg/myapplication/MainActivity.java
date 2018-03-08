package com.gthub.williamg.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.gthub.williamg.myapplication.callback.ChatRoomCallback;
import com.gthub.williamg.myapplication.callback.EmptyCallback;
import com.gthub.williamg.myapplication.callback.UserCallback;
import com.gthub.williamg.myapplication.dto.UserRequest;
import com.gthub.williamg.myapplication.model.Channel;
import com.gthub.williamg.myapplication.network.ServiceFactory;
import com.gthub.williamg.myapplication.restservice.ApiService;
import com.gthub.williamg.myapplication.restservice.OpenFireApiService;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL_OPENFIRE_API = "http://ec2-54-234-60-142.compute-1.amazonaws.com:9090/plugins/restapi/v1/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ApiService apiService = ServiceFactory.createAPiService(this);
//        apiService.startLiveStream(ServiceFactory.STREAM_ID).enqueue(new StreamStatusCallback());
//        apiService.stopLiveStream(ServiceFactory.STREAM_ID).enqueue(new StreamStatusCallback());

        OpenFireApiService apiService2 = ServiceFactory.createOpenFireAPIService(BASE_URL_OPENFIRE_API, this);
        apiService2.getUser("admin").enqueue(new UserCallback());
        UserRequest userRequest = new UserRequest("user1", "passwd1");
        apiService2.createUser(userRequest).enqueue(new EmptyCallback());
        apiService2.getChatRooms("nameservice").enqueue(new ChatRoomCallback(new ChatRoomCallback.ChatRoomCallbackListener() {
            @Override
            public void notifyChatRoomResponse(List<Channel> channels) {
                Toast.makeText(MainActivity.this, channels.size(), Toast.LENGTH_SHORT).show();
            }
        }));

    }
}
