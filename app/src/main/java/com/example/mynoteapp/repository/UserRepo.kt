package com.example.mynoteapp.repository

import com.example.mynoteapp.dao.UserDao
import com.example.mynoteapp.model.User

class UserRepo (private val dao : UserDao) {
    val users = dao.getAllUsers()

    suspend fun insert (user: User){
        return dao.insertUser(user)
    }

    suspend fun delete (user:User) {
        return dao.deleteUser(user)
    }

    suspend fun update(user:User) {
        return dao.updateUser(user)
    }

}