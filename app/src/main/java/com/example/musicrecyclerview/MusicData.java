package com.example.musicrecyclerview;

public class MusicData {
    private String ItemName;
    private String ItemDesc;
    private int ItemImage;


    public MusicData(String itemName, String itemDesc, int itemImage) {
        ItemName = itemName;
        ItemDesc = itemDesc;
        ItemImage = itemImage;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getItemDesc() {
        return ItemDesc;
    }

    public int getItemImage() {
        return ItemImage;
    }

}
