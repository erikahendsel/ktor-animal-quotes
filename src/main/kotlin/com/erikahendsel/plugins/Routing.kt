package com.erikahendsel.plugins

import com.erikahendsel.routes.randomAnimal
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    

    routing {
        randomAnimal()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
