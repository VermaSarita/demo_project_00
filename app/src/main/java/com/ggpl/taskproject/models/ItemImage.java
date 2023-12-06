package com.ggpl.taskproject.models;

import com.google.gson.annotations.SerializedName;

   
public class ItemImage {

   @SerializedName("image_id")
   int imageId;

   @SerializedName("image_url")
   String imageUrl;

   @SerializedName("item_Id")
   int itemId;

   @SerializedName("sno")
   int sno;


    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public int getImageId() {
        return imageId;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public int getItemId() {
        return itemId;
    }
    
    public void setSno(int sno) {
        this.sno = sno;
    }
    public int getSno() {
        return sno;
    }
    
}