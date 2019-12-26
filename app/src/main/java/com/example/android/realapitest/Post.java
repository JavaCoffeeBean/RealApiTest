package com.example.android.realapitest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {


    @SerializedName("ISBN:9780545035170")
    private Post2 post2;

    public Post2 getPost2() {
        return post2;
    }
}
