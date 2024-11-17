package com.adrian

import io.ktor.application.*
import com.adrian.plugins.*
import com.adrian.plugins.di.mainModule
import org.koin.ktor.ext.Koin
import org.koin.ktor.ext.modules



fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    install(Koin) {
        modules(mainModule)
    }
    configureSecurity()
    configureMonitoring()
    configureSerialization()
    configureSockets()
    configureRouting()
}


