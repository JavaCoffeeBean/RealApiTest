package com.example.android.realapitest;

import com.example.android.realapitest.ImageLinks;
import com.example.android.realapitest.IndustryIdentifiers;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class VolumeInfo {

    @SerializedName("title")
    private String title;

    @SerializedName("imageLinks")
    private ImageLinks imageLinks;

    @SerializedName("industryIdentifiers")
    private ArrayList<IndustryIdentifiers> industryIdentifiers;


    public String getTitle() {
        return title;
    }

    public ImageLinks getImageLinks() {
        return imageLinks;
    }

    public ArrayList<IndustryIdentifiers> getIndustryIdentifiers() {
        return industryIdentifiers;
    }
}
