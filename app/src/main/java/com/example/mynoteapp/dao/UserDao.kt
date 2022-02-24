package com.example.mynoteapp.dao

import androidx.room.*
import com.example.mynoteapp.model.User
import kotlinx.coroutines.flow.Flow


@Dao
interface UserDao {
    @Insert
    suspend fun insertUser (user: User)

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun deleteUser(user:User)

    @Query ("SELECT * FROM user_table")
    fun getAllUsers ( ): Flow <List<User>>

}


