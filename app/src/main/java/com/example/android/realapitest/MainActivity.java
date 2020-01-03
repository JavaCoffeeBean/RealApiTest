package com.example.android.realapitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;
import java.math.BigInteger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResult;
    private Object pop;
    private String pop2;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.text_view_result);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.googleapis.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        OpenLibraryApi openLibraryApi = retrofit.create(OpenLibraryApi.class);

        Call<Post> call = openLibraryApi.getPosts(9780545035170L);

        call.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                Log.d(TAG, "onResponse: You got a response, and it was Gucci");

                if (!response.isSuccessful()) {
                    Log.d(TAG, "onResponse:Server was contacted, but could not find what you wanted. ");
                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                try {

                    textViewResult.setText(response.body().getItems().get(0).getVolumeInfo().getTitle());
                }
                catch (Exception e) {
                    textViewResult.setText("Error retrieviing Book name");
                }

                ImageView imageView = (ImageView) findViewById(R.id.my_image_view);

                try {

                    Glide.with(imageView).load(response.body().getItems().get(0).getVolumeInfo().getImageLinks().getThumbnail()).into(imageView);
                }
                catch (Exception e) {
                    imageView.setImageResource(R.drawable.noimage);
                }

            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
    }

}