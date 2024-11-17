package com.adrian.ultimatedagger_hiltguide

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.adrian.ultimatedagger_hiltguide.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service() {

    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()
    }
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}