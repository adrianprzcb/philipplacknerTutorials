package com.adrian.roommigration

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(

    @PrimaryKey(autoGenerate = false)
    val email: String,
    val username: String,
 @ColumnInfo(name = "created" , defaultValue = "0")
   val createdAt: Long = System.currentTimeMillis()
)
