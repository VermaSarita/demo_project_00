package com.ggpl.taskproject;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


public class ReqSaveData {

    @SerializedName("uid")
    int uid;

    @SerializedName("store_uid")
    int storeUid;

    @SerializedName("store_cat_id")
    int storeCatId;

    @SerializedName("store_item_Name")
    String storeItemName;

    @SerializedName("item_MRP")
    int itemMRP;

    @SerializedName("selling_price")
    int sellingPrice;

    @SerializedName("buying_price")
    int buyingPrice;

    @SerializedName("item_weight")
    int itemWeight;

    @SerializedName("item_weight_unit")
    String itemWeightUnit;

    @SerializedName("item_description")
    String itemDescription;

    @SerializedName("item_image")
    List<ItemImage> itemImage;

    public ReqSaveData(int uid, int storeUid, int storeCatId, String storeItemName, int itemMRP, int sellingPrice, int buyingPrice, int itemWeight, String itemWeightUnit, String itemDescription, List<ItemImage> itemImage) {
        this.uid = uid;
        this.storeUid = storeUid;
        this.storeCatId = storeCatId;
        this.storeItemName = storeItemName;
        this.itemMRP = itemMRP;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.itemWeight = itemWeight;
        this.itemWeightUnit = itemWeightUnit;
        this.itemDescription = itemDescription;
        this.itemImage = itemImage;
    }

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

    public void setStoreItemName(String storeItemName) {
        this.storeItemName = storeItemName;
    }
    public String getStoreItemName() {
        return storeItemName;
    }

    public void setItemMRP(int itemMRP) {
        this.itemMRP = itemMRP;
    }
    public int getItemMRP() {
        return itemMRP;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }
    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }
    public int getItemWeight() {
        return itemWeight;
    }

    public void setItemWeightUnit(String itemWeightUnit) {
        this.itemWeightUnit = itemWeightUnit;
    }
    public String getItemWeightUnit() {
        return itemWeightUnit;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemImage(List<ItemImage> itemImage) {
        this.itemImage = itemImage;
    }
    public List<ItemImage> getItemImage() {
        return itemImage;
    }

}




class ItemImage {

    @SerializedName("image_id")
    int imageId;

    @SerializedName("image_url")
    String imageUrl;


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

}
