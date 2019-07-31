package com.example.android.restaurantapp

import com.example.android.restaurantapp.models.RestaurantItem

fun createSampleData() : MutableList<RestaurantItem> {
    val restaurantItemList : MutableList<RestaurantItem> = mutableListOf()

    val cheeseburger = RestaurantItem("1", "Cheeseburger", 7.99,
    "Our take on an American classic, featuring homemade Brioche and house sauce", "classic_burger.jpg")
    val coffee = RestaurantItem("2", "Brewed Coffee", 2.50,
        "Pour-over made fresh to order", "cafe_latte.jpg")
    val milkshake = RestaurantItem("3", "Milkshake", 4.99,
        "Old-fashioned milkshake with homemade whipped cream. Choose from vanilla, chocolate, or strawberry", "cafe_latte.jpg")

    addItem(cheeseburger, restaurantItemList)
    addItem(coffee, restaurantItemList)
    addItem(milkshake, restaurantItemList)

    return restaurantItemList
}

fun createSampleDataMap() : MutableMap<String, RestaurantItem> {
    val restaurantItemMap : MutableMap<String, RestaurantItem> = mutableMapOf()
    val restaurantItemList = createSampleData()
    for (restaurantItem in restaurantItemList) restaurantItemMap[restaurantItem.id] = restaurantItem
    return restaurantItemMap
}

fun addItem(rItem: RestaurantItem, rItemList: MutableList<RestaurantItem>) {
    rItemList.add(rItem)
}