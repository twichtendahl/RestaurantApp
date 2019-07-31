package com.example.android.restaurantapp

import android.content.Context
import android.content.Intent
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
        val overallView = v
        val itemImageView: ImageView = v.findViewById(R.id.itemImage)
        val nameView: TextView = v.findViewById(R.id.nameLabel)
        val descriptionView: TextView = v.findViewById(R.id.itemDescription)
        val priceView: TextView = v.findViewById(R.id.priceLabel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_listing, parent, false)
        return MenuViewHolder(v)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        // Get the item from the data list
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

        // Set up click listener for this item
        holder.overallView.setOnClickListener { view ->
            val itemId: String = restaurantItem.id
            val intent = Intent(context, CustomizeActivity::class.java)
            intent.putExtra(ITEM_ID_KEY, itemId)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return restaurantItemList.count()
    }

    companion object {
        const val ITEM_ID_KEY = "item_id_key"
    }
}