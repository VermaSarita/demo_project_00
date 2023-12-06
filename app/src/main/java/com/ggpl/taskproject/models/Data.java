package com.ggpl.taskproject.models;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Data {

   @SerializedName("uid")
   int uid;

   @SerializedName("store_uid")
   int storeUid;

   @SerializedName("store_cat_id")
   int storeCatId;

   @SerializedName("storeName")
   String storeName;

   @SerializedName("catagryName")
   String catagryName;

   @SerializedName("store_cat_img")
   String storeCatImg;

   @SerializedName("isActive")
   String isActive;

   @SerializedName("catItems")
   List<CatItems> catItems;


    public void setUid(int uid) {
        this.uid = uid;
    }
    public int getUid() {
        return uid;
    }
    
    public void setStoreUid(int storeUid) {
        this.storeUid = storeUid;
    }
    public int getStoreUid() {
        return storeUid;
    }
    
    public void setStoreCatId(int storeCatId) {
        this.storeCatId = storeCatId;
    }
    public int getStoreCatId() {
        return storeCatId;
    }
    
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public String getStoreName() {
        return storeName;
    }
    
    public void setCatagryName(String catagryName) {
        this.catagryName = catagryName;
    }
    public String getCatagryName() {
        return catagryName;
    }
    
    public void setStoreCatImg(String storeCatImg) {
        this.storeCatImg = storeCatImg;
    }
    public String getStoreCatImg() {
        return storeCatImg;
    }
    
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
    public String getIsActive() {
        return isActive;
    }
    
    public void setCatItems(List<CatItems> catItems) {
        this.catItems = catItems;
    }
    public List<CatItems> getCatItems() {
        return catItems;
    }
    
}