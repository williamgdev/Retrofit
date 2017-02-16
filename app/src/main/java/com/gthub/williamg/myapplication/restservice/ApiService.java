package com.gthub.williamg.myapplication.restservice;

import com.gthub.williamg.myapplication.dto.LiveStreamPojo;

import retrofit2.Call;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by wgutierrez on 2/16/17.
 */

public interface ApiService {
    @PUT("live_streams/{id}/start")
    Call<LiveStreamPojo> startLiveStream(@Path("id") String id);

    @PUT("live_streams/{id}/stop")
    Call<LiveStreamPojo> stopLiveStream(@Path("id") String id);

}
