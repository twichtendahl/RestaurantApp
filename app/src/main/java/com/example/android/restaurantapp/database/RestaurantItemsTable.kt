package com.example.android.restaurantapp.database

object RestaurantItemsTable {
    const val TABLE_RESTAURANT_ITEMS = "restaurantItems"
    const val COLUMN_ITEM_ID = "itemId"
    const val COLUMN_ITEM_NAME = "itemName"
    const val COLUMN_ITEM_DESCRIPTION = "itemDescription"
    const val COLUMN_ITEM_PRICE = "itemPrice"
    const val COLUMN_ITEM_IMAGE = "itemImage"

    const val SQL_CREATE = "CREATE TABLE $TABLE_RESTAURANT_ITEMS" +
            "($COLUMN_ITEM_ID TEXT PRIMARY KEY," +
            "$COLUMN_ITEM_NAME TEXT," +
            "$COLUMN_ITEM_DESCRIPTION TEXT," +
            "$COLUMN_ITEM_PRICE REAL," +
            "$COLUMN_ITEM_IMAGE TEXT);"

    const val SQL_DROP = "DROP TABLE $TABLE_RESTAURANT_ITEMS"

    val ALL_COLUMNS = arrayOf(COLUMN_ITEM_ID, COLUMN_ITEM_NAME, COLUMN_ITEM_DESCRIPTION, COLUMN_ITEM_PRICE,
        COLUMN_ITEM_IMAGE)
}
