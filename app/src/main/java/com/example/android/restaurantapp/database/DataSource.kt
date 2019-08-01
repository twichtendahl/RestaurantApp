package com.example.android.restaurantapp.database

import android.content.Context
import android.database.DatabaseUtils
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.android.restaurantapp.models.RestaurantItem

class DataSource(mContext: Context) {
    private var mDbHelper: SQLiteOpenHelper = DBHelper(mContext)
    private var mDatabase: SQLiteDatabase = mDbHelper.writableDatabase

    fun open() { mDatabase = mDbHelper.writableDatabase }
    fun close() { mDbHelper.close() }

    fun createItem(restaurantItem: RestaurantItem):RestaurantItem {
        val values = restaurantItem.toValues()
        mDatabase.insert(RestaurantItemsTable.TABLE_RESTAURANT_ITEMS, null, values)
        return restaurantItem
    }

    fun getRestaurantItemsCount(): Long {
        return DatabaseUtils.queryNumEntries(mDatabase, RestaurantItemsTable.TABLE_RESTAURANT_ITEMS)
    }

    fun seedDatabase(restaurantItemList: List<RestaurantItem>) {
        val numItems = getRestaurantItemsCount()
        if (numItems.toInt() == 0) {
            for (restaurantItem in restaurantItemList) createItem(restaurantItem)
        }
    }

    fun getAllItems() : MutableList<RestaurantItem> {
        val restaurantItemList: MutableList<RestaurantItem> = mutableListOf()
        val cursor = mDatabase.query(RestaurantItemsTable.TABLE_RESTAURANT_ITEMS, RestaurantItemsTable.ALL_COLUMNS,
            null, null, null, null, null)
        while (cursor.moveToNext()) {
            var rId = cursor.getString(cursor.getColumnIndex(RestaurantItemsTable.COLUMN_ITEM_ID))
            var rName = cursor.getString(cursor.getColumnIndex(RestaurantItemsTable.COLUMN_ITEM_NAME))
            var rPrice = cursor.getDouble(cursor.getColumnIndex(RestaurantItemsTable.COLUMN_ITEM_PRICE))
            var rDescription = cursor.getString(cursor.getColumnIndex(RestaurantItemsTable.COLUMN_ITEM_DESCRIPTION))
            var rImage = cursor.getString(cursor.getColumnIndex(RestaurantItemsTable.COLUMN_ITEM_IMAGE))
            restaurantItemList.add(RestaurantItem(rId, rName, rPrice, rDescription, rImage))
        }
        cursor.close()
        return restaurantItemList
    }
}
