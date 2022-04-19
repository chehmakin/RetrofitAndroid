package com.example.retrofitandroid

import com.squareup.moshi.Json

data class modelImage(
    @field:Json(name = "src") val src: String?,
    @field:Json(name = "title") val title: String?,
    @field:Json(name = "alt") val alt: String?
)
