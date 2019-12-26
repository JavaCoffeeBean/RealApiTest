package com.example.android.realapitest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post2 {


    @SerializedName("title")
    private String name;

    @SerializedName("cover")
    private Post3 post3;

    public String getName() {
        return name;
    }

    public Post3 getPost3() {
        return post3;
    }
}
