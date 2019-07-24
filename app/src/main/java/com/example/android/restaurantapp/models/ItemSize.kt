package com.example.android.restaurantapp.models

import java.io.Serializable

data class ItemSize(val id: String?,
                    val item: RestaurantItem,
                    val size: Size,
                    val price: Double) : Serializable {
}