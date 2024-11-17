package com.adrian.chatappwithktor.presentation.chat

import com.adrian.chatappwithktor.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)
