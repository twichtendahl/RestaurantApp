package com.example.android.restaurantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.android.restaurantapp.models.RestaurantItem

class CustomizeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customize)

        // Get data passed in by Main
        val restaurantItem = intent.getSerializableExtra(RestaurantMenuAdapter.RESTAURANT_ITEM) as RestaurantItem
        val itemId = restaurantItem.id
        val itemName = restaurantItem.name
        val itemDescription = restaurantItem.description
        val itemPrice = restaurantItem.price


//        val itemDisplay: TextView = findViewById(R.id.itemDisplay)
//        itemDisplay.text = itemDescription
    }
}
