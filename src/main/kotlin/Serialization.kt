package co.hondaya

import io.ktor.http.*
import io.ktor.network.selector.InterestSuspensionsMap
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureSerialization() {
    InterestSuspensionsMap
}
