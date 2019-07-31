package com.example.android.restaurantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CustomizeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customize)

        val itemId = intent.extras.getString(RestaurantMenuAdapter.ITEM_ID_KEY)
        val restaurantItem = createSampleDataMap()[itemId]
        val itemDisplay: TextView = findViewById(R.id.itemDisplay)
        itemDisplay.text = restaurantItem!!.description

    }
}
