package com.erikahendsel.data.model

import kotlinx.serialization.Serializable

//kotlin serialization - this will allow to parse this content of the class to json and send it over the network
@Serializable
data class Animal(
    val name: String,
    val quote: String,
    val quoteAuthor: String,
    val imageUrl: String
)
