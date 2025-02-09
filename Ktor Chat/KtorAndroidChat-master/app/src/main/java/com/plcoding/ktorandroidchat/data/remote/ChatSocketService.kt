package com.plcoding.ktorandroidchat.data.remote

import com.plcoding.ktorandroidchat.domain.model.Message
import com.plcoding.ktorandroidchat.util.Resource
import kotlinx.coroutines.flow.Flow


interface ChatSocketService {

    suspend fun initSession(
        username: String,

    ): Resource<Unit>

    suspend fun sendMessage(message: String)


    fun observeMessages(): Flow<Message>

    suspend fun closeSession()



        companion object {
            const val BASE_URL = "http:// 192.168.56.1:8082"
        }

        sealed class Endpoints(val url: String){
            object ChatSocket: Endpoints("$BASE_URL/chat-socket")
        }

}