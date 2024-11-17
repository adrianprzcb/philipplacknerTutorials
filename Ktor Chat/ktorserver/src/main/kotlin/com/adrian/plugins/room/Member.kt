package com.adrian.plugins.room

import io.ktor.http.cio.websocket.*
import io.ktor.websocket.*
import javax.print.attribute.standard.JobOriginatingUserName

data class Member(
    val username: String,
    val sessionId: String,
    val socket: WebSocketSession
)