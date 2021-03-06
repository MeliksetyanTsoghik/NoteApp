package com.example.mynoteapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mynoteapp.dao.UserDao
import com.example.mynoteapp.model.User


@Database( entities =[User::class], version = 1)
abstract class UserDatabase : RoomDatabase () {
    abstract fun userDao(): UserDao


    companion object {
        @Volatile
        private var INSTANCE: UserDatabase? = null

        fun getInstance(context: Context): UserDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        UserDatabase::class.java,
                        "user_database"
                    ).build()
                }
                return instance
            }
        }
    }
}



