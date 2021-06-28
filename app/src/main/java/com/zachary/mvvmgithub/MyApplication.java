package com.zachary.mvvmgithub;

import android.app.Application;

import com.zachary.mvvmgithub.api.Api;
import com.zachary.mvvmgithub.api.RetrofitClient;
import com.zachary.mvvmgithub.db.UserDataBase;

public class MyApplication extends Application {

    private static UserDataBase userDataBase;
    private static Api api;

    @Override
    public void onCreate() {
        super.onCreate();
        userDataBase = UserDataBase.getInstance(this);
        api = RetrofitClient.getInstance().getApi();
    }

    public static UserDataBase getUserDataBase() {
        return userDataBase;
    }

    public static Api getApi() {
        return api;
    }


}
