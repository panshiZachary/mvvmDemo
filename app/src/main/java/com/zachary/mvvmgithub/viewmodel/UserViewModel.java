package com.zachary.mvvmgithub.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.zachary.mvvmgithub.MyApplication;
import com.zachary.mvvmgithub.db.UserDao;
import com.zachary.mvvmgithub.db.UserDataBase;
import com.zachary.mvvmgithub.model.User;
import com.zachary.mvvmgithub.repository.UserRepository;

public class UserViewModel extends AndroidViewModel {
    private final UserRepository userRepository;
    private LiveData<User> user;

    private String userName = "Zachary";

    public UserViewModel(@NonNull Application application) {
        super(application);
        UserDataBase dataBase = MyApplication.getUserDataBase();
        UserDao userDao = dataBase.userDao();

        userRepository = new UserRepository(userDao, MyApplication.getApi());

        user = userRepository.getUser(userName);
    }

    public LiveData<User> getUser(){
        return user;
    }

    public void refresh(){
        userRepository.refresh(userName);
    }
}
