package com.zachary.mvvmgithub.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.zachary.mvvmgithub.model.User;

@Database(entities = {User.class},version = 1)
public abstract class UserDataBase extends RoomDatabase {
    private static final String DATABASE_NAME = "uset_db";

    private static UserDataBase dataBaseInstance;

    public static synchronized UserDataBase getInstance(Context context) {
        if (dataBaseInstance == null){
            dataBaseInstance  = Room.databaseBuilder(context.getApplicationContext(),UserDataBase.class,DATABASE_NAME).build();
        }
        return dataBaseInstance;
    }

    public abstract UserDao userDao();
}
