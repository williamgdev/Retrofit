
package com.gthub.williamg.myapplication.javamigrate.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StreamTarget extends BaseDto{

    @SerializedName("id")
    @Expose
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
