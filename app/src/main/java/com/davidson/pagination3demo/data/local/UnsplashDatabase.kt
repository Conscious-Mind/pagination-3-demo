package com.davidson.pagination3demo.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.davidson.pagination3demo.data.local.dao.UnsplashImageDao
import com.davidson.pagination3demo.data.local.dao.UnsplashRemoteKeysDao
import com.davidson.pagination3demo.model.UnsplashImage
import com.davidson.pagination3demo.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao
}