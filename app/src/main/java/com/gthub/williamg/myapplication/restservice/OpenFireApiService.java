package com.gthub.williamg.myapplication.restservice;

import com.gthub.williamg.myapplication.dto.BaseResponse;
import com.gthub.williamg.myapplication.dto.UserRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface OpenFireApiService {

    @POST("users")
    Call<BaseResponse> createUser(@Body UserRequest user);

//    @GET("chatrooms")
//    Call
//    GET /chatrooms/{roomName}
//    POST /chatrooms/{roomName}/{roles}/{name}
}
