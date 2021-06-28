package com.zachary.mvvmgithub.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class User {

    @PrimaryKey()
    @ColumnInfo(name = "id",typeAffinity = ColumnInfo.INTEGER)
    public int id;

    @ColumnInfo(name = "name",typeAffinity = ColumnInfo.TEXT)
    public String name;

    @ColumnInfo(name = "avatar",typeAffinity = ColumnInfo.TEXT)
    public String avatar;

    @ColumnInfo(name = "followers",typeAffinity = ColumnInfo.INTEGER)
    public String followers;

    @ColumnInfo(name = "following",typeAffinity = ColumnInfo.INTEGER)
    public String following;

    @ColumnInfo(name = "blog",typeAffinity = ColumnInfo.TEXT)
    public String blog;

    @ColumnInfo(name = "company",typeAffinity = ColumnInfo.TEXT)
    public String company;


    @ColumnInfo(name = "bio",typeAffinity = ColumnInfo.TEXT)
    public String bio;

    @ColumnInfo(name = "location",typeAffinity = ColumnInfo.TEXT)
    public String location;

    @ColumnInfo(name = "htmlUrl",typeAffinity = ColumnInfo.TEXT)
    public String htmlUrl;

    public User(int id, String name, String avatar, String followers, String following, String blog, String company, String bio, String location, String htmlUrl) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.followers = followers;
        this.following = following;
        this.blog = blog;
        this.company = company;
        this.bio = bio;
        this.location = location;
        this.htmlUrl = htmlUrl;
    }
}
