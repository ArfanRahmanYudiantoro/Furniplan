package com.celtic.furniplan.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.celtic.furniplan.R
import com.celtic.furniplan.databinding.BannerItemBinding
import com.celtic.furniplan.model.Banner

class HomeAdapter(private val bannerlist: List<Banner>) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    // This method creates a new ViewHolder object for each item in the RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Inflate the layout for each item and return a new ViewHolder object
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.banner_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return bannerlist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentBanner = bannerlist[position]
        holder.banner.setImageResource(currentBanner.imageEvent)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val banner: ImageView = itemView.findViewById(R.id.banner_image_view)
    }
}

