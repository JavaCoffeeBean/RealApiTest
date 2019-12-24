package com.example.android.realapitest;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OpenLibraryApi {

    @GET("api/books?bibkeys=ISBN:9780743482844&jscmd=data&format=json")
    Call<Post> getPosts();

}
