package com.adrian.ultimatedagger_hiltguide.data.repository

import android.app.Application
import com.adrian.ultimatedagger_hiltguide.R
import com.adrian.ultimatedagger_hiltguide.data.remote.MyApi
import com.adrian.ultimatedagger_hiltguide.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("hello from the repository, The app name is $appName")
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}