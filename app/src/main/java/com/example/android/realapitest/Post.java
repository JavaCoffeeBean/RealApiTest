package com.example.android.realapitest;

import com.example.android.realapitest.ItemsList.Items;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Post {




    @SerializedName("items")
    private ArrayList<Items> items;

    public ArrayList<Items> getItems() {
        return items;
    }
}
