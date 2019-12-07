package com.pixelkaveman.redditapp;

import com.pixelkaveman.redditapp.Model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SubredditPopularAPI {

    String BASE_URL = "https://reddit.com";

    @GET("/subreddits/popular.json")
    Call<List<Post>> getPost();
}
