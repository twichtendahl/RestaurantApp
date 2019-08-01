package com.example.android.restaurantapp

import com.example.android.restaurantapp.models.RestaurantItem

fun createSampleData() : MutableList<RestaurantItem> {
    val restaurantItemList : MutableList<RestaurantItem> = mutableListOf()

    // Create instances of RestaurantItem objects
    val cheeseburger = RestaurantItem("Cheeseburger", 7.99,
        "Our take on an American classic, featuring homemade Brioche and house sauce",
        "classic_burger.jpg")
    val coffee = RestaurantItem("Brewed Coffee", 2.50, "Pour-over made fresh to order",
        "cafe_latte.jpg")
    val milkshake = RestaurantItem("Milkshake", 4.99,
        "Old-fashioned milkshake with homemade whipped cream. Choose from vanilla, chocolate, or strawberry",
        "cafe_latte.jpg")
    val berryTart = RestaurantItem("Berry Tart", 4.99,
        "A sweet treat made with seasonal fruit","berry_tart.jpg")
    val chopSalad = RestaurantItem("Chop-chop Salad", 6.99,
        "An eclectic creation with chicken breast, salami, and fresh greens", "chef_salad.jpg")
    val turkeyMelt = RestaurantItem("Turkey Melt", 7.99,
        "Delicious combination of toast on bread of your choice, roast turkey, provolone, and tomato",
        "classic_burger.jpg")
    val hotChocolate = RestaurantItem("Hot Chocolate", 2.99,
        "Indulge in our proprietary blend of semi-sweet, bittersweet, and white chocolate with whipped cream",
        "cafe_latte.jpg")

    // Add the restaurantItems to list
    addItem(cheeseburger, restaurantItemList)
    addItem(coffee, restaurantItemList)
    addItem(milkshake, restaurantItemList)
    addItem(berryTart, restaurantItemList)
    addItem(chopSalad, restaurantItemList)
    addItem(turkeyMelt, restaurantItemList)
    addItem(hotChocolate, restaurantItemList)

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