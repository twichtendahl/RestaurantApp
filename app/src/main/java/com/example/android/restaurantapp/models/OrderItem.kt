package com.example.android.restaurantapp.models

import java.io.Serializable

data class OrderItem(val id: String?,
                     val itemSize: ItemSize,
                     val quantity: Int,
                     val customizations: List<Customization>) : Serializable {
}