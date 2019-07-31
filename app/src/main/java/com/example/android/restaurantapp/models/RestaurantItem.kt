package com.example.android.restaurantapp.models

import java.io.Serializable

data class RestaurantItem(val id: String,
                          val name: String,
                          val price: Double,
                          val description: String,
                          val image: String) : Serializable {
}