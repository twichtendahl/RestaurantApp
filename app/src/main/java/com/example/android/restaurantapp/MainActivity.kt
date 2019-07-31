package com.example.android.restaurantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val restaurantItemList = createSampleData()
    val restaurantItemMap = createSampleDataMap()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var restaurantMenuAdapter = RestaurantMenuAdapter(restaurantItemList, this)
        val listView : RecyclerView = findViewById(R.id.rvItems)
        listView.adapter = restaurantMenuAdapter

    }
}
