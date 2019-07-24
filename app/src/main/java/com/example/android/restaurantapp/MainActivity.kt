package com.example.android.restaurantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    val restaurantItemList = createSampleData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var restaurantMenuAdapter = RestaurantMenuAdapter(this, restaurantItemList)
        val listView = findViewById<ListView>(android.R.id.list)
        listView.adapter = restaurantMenuAdapter

    }
}
