package com.gthub.williamg.myapplication.javamigrate;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.gthub.williamg.myapplication.R;
import com.gthub.williamg.myapplication.javamigrate.dto.Properties;
import com.gthub.williamg.myapplication.javamigrate.dto.Property;
import com.gthub.williamg.myapplication.javamigrate.dto.UserRequest;
import com.gthub.williamg.myapplication.javamigrate.network.OpenFireManager;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RetrofitFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RetrofitFragment extends Fragment {

    private static final String BASE_URL_OPENFIRE_API = "http://ec2-54-234-60-142.compute-1.amazonaws.com:9090/plugins/restapi/v1/";
    @NotNull
    public static final String FLAG = "RetrofitFragment";

    public RetrofitFragment() {
        // Required empty public constructor
    }

    public static RetrofitFragment newInstance() {
        RetrofitFragment fragment = new RetrofitFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        WowzaApiService apiService = OpenFireManager.createAPiService(this);
//        apiService.startLiveStream(OpenFireManager.STREAM_ID).enqueue(new StreamStatusCallback());
//        apiService.stopLiveStream(OpenFireManager.STREAM_ID).enqueue(new StreamStatusCallback());

        OpenFireManager apiService2 = OpenFireManager.getInstance(BASE_URL_OPENFIRE_API, getContext());
//        apiService2.getUser("admin", new OpenFireManager.OpenFireManagerListener<UserResponse>() {
//            @Override
//            public void onSuccess(UserResponse result) {
//                showText(result.getEmail());
//            }
//
//            @Override
//            public void onError(String text) {
//                showText(text);
//            }
//        });

        UserRequest userRequest = new UserRequest("user3", "passwd3");
        Properties properties = new Properties();
        Property property1 = new Property();
        property1.setKey("created");
        property1.setValue("today");
        Property property2 = new Property();
        property2.setKey("provider");
        property2.setValue("Facebook");
        List<Property> list = new ArrayList<>();
        list.add(property1);
        list.add(property2);
        properties.setProperty(list);
        userRequest.setProperties(properties);
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
//        apiService2.getChatRooms("conference", new OpenFireManager.OpenFireManagerListener<List<Channel>>() {
//            @Override
//            public void onSuccess(List<Channel> result) {
//                showText(result.size() + "");
//            }
//
//            @Override
//            public void onError(String text) {
//                showText(text);
//            }
//        });

    }

    private void showText(String message) {
        if (getActivity() != null) {
            Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_retrofit, container, false);
    }

}
