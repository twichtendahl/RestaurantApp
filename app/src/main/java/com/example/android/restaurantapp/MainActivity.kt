package com.example.android.restaurantapp

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.android.restaurantapp.database.DBHelper
import com.example.android.restaurantapp.database.DataSource

class MainActivity : AppCompatActivity() {

    val restaurantItemList = createSampleData()
    val restaurantItemMap = createSampleDataMap()
    // Construct database
    val mDataSource = DataSource(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mDataSource.open()
        mDataSource.seedDatabase(restaurantItemList)
        val listFromDB = mDataSource.getAllItems()

        val restaurantMenuAdapter = RestaurantMenuAdapter(listFromDB, this)
        val listView : RecyclerView = findViewById(R.id.rvItems)
        listView.adapter = restaurantMenuAdapter

    }

    override fun onPause() {
        super.onPause()
        mDataSource.close()
    }

    override fun onResume() {
        super.onResume()
        mDataSource.open()
    }
}
