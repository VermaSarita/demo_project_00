package com.ggpl.taskproject.models;

import com.google.gson.annotations.SerializedName;


public class ReqGetData {

    @SerializedName("store_uid")
    int storeUid;

    public int getStoreUid() {
        return storeUid;
    }

    public void setStoreUid(int storeUid) {
        this.storeUid = storeUid;
    }

    public ReqGetData(int storeUid) {
        this.storeUid = storeUid;
    }
}