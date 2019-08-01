package com.example.android.restaurantapp.models

import android.content.ContentValues
import com.example.android.restaurantapp.database.RestaurantItemsTable
import java.io.Serializable
import java.util.*

data class RestaurantItem(val id: String,
                          val name: String,
                          val price: Double,
                          val description: String,
                          val image: String) : Serializable {

    constructor(name: String, price: Double, description: String, image: String) : this(UUID.randomUUID().toString(),
        name, price, description, image)

    constructor() : this("", 0.0, "", "")

    fun toValues(): ContentValues {
        val contentValues = ContentValues(5)
        contentValues.put(RestaurantItemsTable.COLUMN_ITEM_ID, id)
        contentValues.put(RestaurantItemsTable.COLUMN_ITEM_NAME, name)
        contentValues.put(RestaurantItemsTable.COLUMN_ITEM_DESCRIPTION, description)
        contentValues.put(RestaurantItemsTable.COLUMN_ITEM_PRICE, price)
        contentValues.put(RestaurantItemsTable.COLUMN_ITEM_IMAGE, image)
        return  contentValues
    }
}