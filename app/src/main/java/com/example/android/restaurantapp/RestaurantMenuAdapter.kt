package com.example.android.restaurantapp

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.restaurantapp.models.RestaurantItem
import java.io.InputStream

class RestaurantMenuAdapter(private val restaurantItemList: List<RestaurantItem>, private val context: Context) :
    RecyclerView.Adapter<RestaurantMenuAdapter.MenuViewHolder>() {

    class MenuViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val itemImageView: ImageView
        val nameView: TextView
        val descriptionView: TextView
        val priceView: TextView

        init {
            itemImageView = v.findViewById(R.id.itemImage)
            nameView = v.findViewById(R.id.nameLabel)
            descriptionView = v.findViewById(R.id.itemDescription)
            priceView = v.findViewById(R.id.priceLabel)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_listing, parent, false)
        return MenuViewHolder(v)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val restaurantItem = restaurantItemList[position]

        // Get the item image
        val imageResource = restaurantItem.image
        val inputStream: InputStream = context.assets.open(imageResource)
        val d: Drawable = Drawable.createFromStream(inputStream, null)
        holder.itemImageView.setImageDrawable(d)

        // Get the various text
        holder.nameView.text = restaurantItem.name
        holder.descriptionView.text = restaurantItem.description
        holder.priceView.text = restaurantItem.price.toString()
    }

    override fun getItemCount(): Int {
        return restaurantItemList.count()
    }
}