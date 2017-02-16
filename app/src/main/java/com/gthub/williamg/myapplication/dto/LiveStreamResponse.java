
package com.gthub.williamg.myapplication.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LiveStreamResponse extends BaseResponse{
    @SerializedName("live_stream")
    @Expose
    private LiveStream liveStream;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public LiveStream getLiveStream() {
        return liveStream;
    }

    public void setLiveStream(LiveStream liveStream) {
        this.liveStream = liveStream;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
