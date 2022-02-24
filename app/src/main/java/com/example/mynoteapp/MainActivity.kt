package com.example.mynoteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mynoteapp.dao.UserDao
import com.example.mynoteapp.databinding.ActivityMainBinding
import com.example.mynoteapp.db.UserDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var userDao: UserDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.SplashScreen)

        setContentView(R.layout.activity_main)
        val db = Room.databaseBuilder(
                applicationContext,
                UserDatabase::class.java, "user_database"
        ).build()
                userDao = db.userDao()



        //login()






    }

//    private fun login() {
//
//        val login = binding.editLogin.text
//        val password = binding.editPassword.text
//
//  }
}