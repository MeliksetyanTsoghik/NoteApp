package com.example.mynoteapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "user_table")
data class User (
    @PrimaryKey( autoGenerate = true)
    var id : Int ,

    @ColumnInfo
    var name: String,

    @ColumnInfo
    var login: String,

    @ColumnInfo
    var password: String
        )
