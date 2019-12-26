package com.example.android.realapitest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OpenLibraryApi {

    @GET("api/books?bibkeys=ISBN:9780605039070&jscmd=data&format=json")
    Call<Post> getPosts();

}
