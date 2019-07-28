package com.example.android.restaurantapp

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.android.restaurantapp.models.RestaurantItem
import java.io.InputStream

class RestaurantMenuAdapter(context: Context, items: MutableList<RestaurantItem>) : ArrayAdapter<RestaurantItem>(context,
    R.layout.item_listing, items) {

    private val itemListInflater: LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        // If view is null, use the inflater to get the appropriate view (item_listing)
        val view : View = convertView ?: itemListInflater.inflate(R.layout.item_listing, parent, false)

        // Create views for each of the required data fields
        val nameLabel: TextView = view.findViewById(R.id.nameLabel)
        val itemImage: ImageView = view.findViewById(R.id.itemImage)
        val itemDescription: TextView = view.findViewById(R.id.itemDescription)
        val priceLabel: TextView = view.findViewById(R.id.priceLabel)

        // Retrieve the data
        val restaurantItem = this.getItem(position)

        // Display the data in the generated views
        nameLabel.text = restaurantItem.name
        itemDescription.text = restaurantItem.description
        priceLabel.text = restaurantItem.price.toString()

        // Get the item image
        val imageResource = restaurantItem.image
        val inputStream: InputStream = context.assets.open(imageResource)
        val d: Drawable = Drawable.createFromStream(inputStream, null)
        itemImage.setImageDrawable(d)


        return view
    }
}