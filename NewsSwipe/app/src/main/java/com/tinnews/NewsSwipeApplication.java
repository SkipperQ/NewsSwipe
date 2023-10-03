package com.newsswipe;

import android.app.Application;

import androidx.room.Room;

import com.newsswipe.database.NewsSwipeDatabase;

public class NewsSwipeApplication extends Application {
    private static NewsSwipeDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        database = Room.databaseBuilder(this, NewsSwipeDatabase.class, "newsswipe_db")
                .build();
    }

    public static NewsSwipeDatabase getDatabase() {
        return database;
    }
}
