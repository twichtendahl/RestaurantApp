package com.example.android.restaurantapp.models

import java.io.Serializable

data class Customer(val id: String?,
                    val firstName: String,
                    val lastName: String,
                    val email: String,
                    val phoneNumber: String) : Serializable {
}