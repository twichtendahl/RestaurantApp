package com.example.android.restaurantapp

import com.example.android.restaurantapp.models.RestaurantItem

fun createSampleData() : MutableList<RestaurantItem> {
    val restaurantItemList : MutableList<RestaurantItem> = mutableListOf()

    val cheeseburger = RestaurantItem(null, "Cheeseburger", 7.99,
    "Our take on an American classic, featuring homemade Brioche and house sauce", "classic_burger.jpg")
    val coffee = RestaurantItem(null, "Brewed Coffee", 2.50,
        "Pour-over made fresh to order", "cafe_latte.jpg")
    val milkshake = RestaurantItem(null, "Milkshake", 4.99,
        "Old-fashioned milkshake with homemade whipped cream. Choose from vanilla, chocolate, or strawberry", "cafe_latte.jpg")

    addItem(cheeseburger, restaurantItemList)
    addItem(coffee, restaurantItemList)
    addItem(milkshake, restaurantItemList)

    return restaurantItemList
}

fun addItem(rItem: RestaurantItem, rItemList: MutableList<RestaurantItem>) {
    rItemList.add(rItem)
}