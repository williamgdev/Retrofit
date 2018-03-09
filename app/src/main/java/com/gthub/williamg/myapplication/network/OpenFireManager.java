package com.gthub.williamg.myapplication.network;

import android.content.Context;

import com.gthub.williamg.myapplication.dto.ChatRoomResponse;
import com.gthub.williamg.myapplication.dto.UserRequest;
import com.gthub.williamg.myapplication.dto.UserResponse;
import com.gthub.williamg.myapplication.model.Channel;
import com.gthub.williamg.myapplication.restservice.OpenFireApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class OpenFireManager {
    private static OpenFireManager instance;
    private final OpenFireApiService apiService;

    private OpenFireManager(String baseUrl, Context context){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(OpenFireInterceptor.buildHttpClient(context))
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        apiService = retrofit.create(OpenFireApiService.class);
    }

    public static OpenFireManager getInstance(String baseUrl, Context context) {
        if (instance == null) {
            instance = new OpenFireManager(baseUrl, context);
        }
        return instance;
    }

    public void getUser(String userName, OpenFireManagerListener<UserResponse> listener) {
        apiService.getUser(userName).enqueue(getUserCallBack(listener));
    }

    private Callback<UserResponse> getUserCallBack(final OpenFireManagerListener<UserResponse> listener) {
        return new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                switch (response.code()) {
                    case OpenFireManagerListener.OK:
                        if (response.body() != null) {
                            listener.onSuccess(response.body());
                        } else {
                            listener.onError("Response is null");
                        }
                        break;
                    default:
                        listener.onError("Error " + response.code());
                        break;
                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                listener.onError(t.getMessage());
            }
        };
    }

    public void createUser(UserRequest userRequest, OpenFireManagerListener<Boolean> openFireManagerListener) {
        apiService.createUser(userRequest).enqueue(createUserCallBack(openFireManagerListener));
    }

    private Callback<Void> createUserCallBack(final OpenFireManagerListener<Boolean> listener) {
        return new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                switch (response.code()) {
                    case OpenFireManagerListener.CREATED:
                        if (response.body() != null) {
                            listener.onSuccess(true);
                        } else {
                            listener.onSuccess(false);
                        }
                        break;
                    case OpenFireManagerListener.SERVER_ERROR:
                        listener.onSuccess(false);
                        break;
                    default:
                        listener.onError("Error " + response.code());
                        break;
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                listener.onError(t.getMessage());
            }
        };
    }

    public void getChatRooms(String nameservice, OpenFireManagerListener<List<Channel>> listener) {
        apiService.getChatRooms(nameservice).enqueue(getChatRoomsCallBack(listener));
    }

    private Callback<ChatRoomResponse> getChatRoomsCallBack(final OpenFireManagerListener<List<Channel>> listener) {
        return new Callback<ChatRoomResponse>() {
            @Override
            public void onResponse(Call<ChatRoomResponse> call, Response<ChatRoomResponse> response) {
                switch (response.code()) {
                    case OpenFireManagerListener.OK:
                        if (response.body() != null) {
                            listener.onSuccess(Channel.create(response.body().getChatRooms()));
                        } else {
                            listener.onError("Response is null");
                        }
                        break;
                    default:
                        listener.onError("Error " + response.code());
                        break;
                }
            }

            @Override
            public void onFailure(Call<ChatRoomResponse> call, Throwable t) {
                listener.onError(t.getMessage());
            }
        };
    }

    public interface OpenFireManagerListener<T> extends BaseApiListener {
        void onSuccess(T result);
        void onError(String text);
    }
}
