package co.hondaya

import io.ktor.server.application.*
import io.ktor.server.cio.CIO
import io.ktor.server.engine.embeddedServer

fun main() {
    embeddedServer(CIO,
        host = "0.0.0.0",
        port = 8080,
        module = Application::module
    ).start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureRouting()
}
