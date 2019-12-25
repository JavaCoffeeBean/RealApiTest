package com.example.android.realapitest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post2 {


    @SerializedName("title")
    private String name;

    public String getName() {
        return name;
    }
}
