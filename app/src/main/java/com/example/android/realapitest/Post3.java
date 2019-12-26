package com.example.android.realapitest;

import android.widget.ImageView;

import com.google.gson.annotations.SerializedName;

public class Post3 {

    @SerializedName("medium")
    private String mediumCover;

    public String getMediumCover() {
        return mediumCover;
    }
}
