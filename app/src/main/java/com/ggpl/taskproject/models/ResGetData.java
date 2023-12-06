package com.ggpl.taskproject.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ResGetData {

   @SerializedName("data")
   List<Data> data;

   @SerializedName("successful")
   boolean successful;

   @SerializedName("message")
   String message;


    public void setData(List<Data> data) {
        this.data = data;
    }
    public List<Data> getData() {
        return data;
    }
    
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
    public boolean getSuccessful() {
        return successful;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    
}