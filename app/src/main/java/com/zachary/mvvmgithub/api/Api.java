package com.zachary.mvvmgithub.api;

import com.zachary.mvvmgithub.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {

    @GET("users/{userId}")
    Call<User> getUser(@Path("userId") String userId);
}
