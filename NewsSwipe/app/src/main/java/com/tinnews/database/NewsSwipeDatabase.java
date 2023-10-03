package com.newsswipe.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.newsswipe.model.Article;

@Database(entities = {Article.class}, version = 1, exportSchema = false)
public abstract class NewsSwipeDatabase extends RoomDatabase {
    public abstract ArticleDao articleDao();
}

