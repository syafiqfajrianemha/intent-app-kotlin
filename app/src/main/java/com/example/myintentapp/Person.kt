package com.example.myintentapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize // membuat implementasi Parcelable secara otomatis
data class Person(
    val name: String?,
    val age: Int?,
    val email: String?,
    val city: String?
) : Parcelable