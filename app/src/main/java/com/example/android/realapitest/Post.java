package com.example.android.realapitest;

import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("ISBN:9780743482844")
    private Object isbn;


    public Object getIsbn() {
        return isbn;
    }
}
