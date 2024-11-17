package com.adrian.plugins

import com.adrian.plugins.room.RoomController
import com.adrian.plugins.routes.chatSocket
import com.adrian.plugins.routes.getAllMessages
import io.ktor.application.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject


fun Application.configureRouting() {

    val roomController by inject<RoomController>()
    install(Routing){
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
