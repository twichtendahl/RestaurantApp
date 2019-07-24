package com.example.android.restaurantapp.models

import java.io.Serializable

data class RestaurantOrder(val id: String?,
                           val items: List<OrderItem>,
                           val customer: Customer) : Serializable {
}