package com.gthub.williamg.myapplication;

import retrofit2.Call;
import retrofit2.http.PUT;

/**
 * Created by wgutierrez on 2/16/17.
 */

public interface ApiService {
    @PUT("/live_streams/{id}/start")
    Call<StreamStatus> getLiveStreamStatus();

}
