package com.example.android.realapitest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OpenLibraryApi {

    @GET("books/v1/volumes?q=isbn:9780743482844&key=AIzaSyDG6IF6-n0EDhvSfac4OYNqtU520xQUqzQ")
    Call<Post> getPosts();

}
