package com.ggpl.taskproject.models;
import java.util.List;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

   
public class CatItems {

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

   @SerializedName("isNewArrival")
   String isNewArrival;

   @SerializedName("minimun_Qty_Buy")
   int minimunQtyBuy;

   @SerializedName("minimun_Qty_Unit")
   String minimunQtyUnit;

   @SerializedName("added_on")
   Date addedOn;

   @SerializedName("isactive")
   String isactive;

   @SerializedName("isOutOfStock")
   String isOutOfStock;


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
    
    public void setIsNewArrival(String isNewArrival) {
        this.isNewArrival = isNewArrival;
    }
    public String getIsNewArrival() {
        return isNewArrival;
    }
    
    public void setMinimunQtyBuy(int minimunQtyBuy) {
        this.minimunQtyBuy = minimunQtyBuy;
    }
    public int getMinimunQtyBuy() {
        return minimunQtyBuy;
    }
    
    public void setMinimunQtyUnit(String minimunQtyUnit) {
        this.minimunQtyUnit = minimunQtyUnit;
    }
    public String getMinimunQtyUnit() {
        return minimunQtyUnit;
    }
    
    public void setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
    }
    public Date getAddedOn() {
        return addedOn;
    }
    
    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }
    public String getIsactive() {
        return isactive;
    }
    
    public void setIsOutOfStock(String isOutOfStock) {
        this.isOutOfStock = isOutOfStock;
    }
    public String getIsOutOfStock() {
        return isOutOfStock;
    }
    
}