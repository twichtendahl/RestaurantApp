package com.example.android.restaurantapp.models

import java.io.Serializable

data class Customization(val id: String?,
                         val name: String,
                         val price: Double) : Serializable {
}