package com.adrian.roommigration

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = Room.databaseBuilder(
            applicationContext,
            UserDatabase::class.java,
            "users.db"
        ).addMigrations(UserDatabase.migration3to4).build()


        lifecycleScope.launch {
            db.dao.getUsers().forEach(::println)
        }
        (1..10).forEach {
            lifecycleScope.launch {
                db.dao.insertSchool(
                    School(
                        name = "name$it"
                    )
                )
            }
        }

   /*    (1..10).forEach {
            lifecycleScope.launch {
                db.dao.insertUser(
                    User(
                        email = "email$it@email.com",
                        username = "username$it"
                    )
                )
            }
        }*/

    }
 }



