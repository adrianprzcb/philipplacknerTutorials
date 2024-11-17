package com.adrian.ultimatedagger_hiltguide.data.remote

import retrofit2.http.GET

interface MyApi {

    @GET("/test")
    suspend fun doNetworkCall()
}