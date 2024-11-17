package com.adrian.ultimatedagger_hiltguide.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}