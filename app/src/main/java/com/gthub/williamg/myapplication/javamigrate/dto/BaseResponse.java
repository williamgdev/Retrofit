package com.gthub.williamg.myapplication.javamigrate.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseResponse {

        @SerializedName("meta")
        @Expose
        private Meta meta;

        public Meta getMeta() {
            return meta;
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }
}
