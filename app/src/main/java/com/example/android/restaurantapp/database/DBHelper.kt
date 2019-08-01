package com.example.android.restaurantapp.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context?) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(RestaurantItemsTable.SQL_CREATE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL(RestaurantItemsTable.SQL_DROP)
        onCreate(db)
    }

    companion object {
        const val DB_NAME = "restaurant_app.db"
        const val DB_VERSION = 1
    }
}
