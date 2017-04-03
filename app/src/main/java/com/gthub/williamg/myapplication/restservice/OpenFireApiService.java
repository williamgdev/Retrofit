package com.gthub.williamg.myapplication.restservice;

import com.gthub.williamg.myapplication.dto.ChatRoomResponse;
import com.gthub.williamg.myapplication.dto.UserRequest;
import com.gthub.williamg.myapplication.dto.UserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OpenFireApiService {

    @POST("users")
    Call<Void> createUser(@Body UserRequest user);

    @GET("users/{username}")
    Call<UserResponse> getUser(@Path("username") String userName);

    @GET("chatrooms")
    Call<ChatRoomResponse> getChatRooms(@Query("servicename") String service);

//    GET /chatrooms/{roomName}
//    POST /chatrooms/{roomName}/{roles}/{name}
}
