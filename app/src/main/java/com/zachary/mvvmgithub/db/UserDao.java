package com.zachary.mvvmgithub.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.zachary.mvvmgithub.model.User;

import retrofit2.http.DELETE;

@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(User user);

    @DELETE
    void deleteStudent(User user);

    @Query("SELECT * FROM user WHERE name =:name")
    LiveData<User> getUserByName(String name);

}
