package com.adrian.roommigration

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class School (
    @PrimaryKey(autoGenerate = false)
    val name: String,
        )