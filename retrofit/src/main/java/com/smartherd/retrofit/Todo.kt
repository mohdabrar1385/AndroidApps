package com.smartherd.retrofit

import com.google.gson.annotations.SerializedName

data class Todo(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)