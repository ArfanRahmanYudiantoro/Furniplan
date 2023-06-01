package com.celtic.furniplan.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.celtic.furniplan.databinding.BannerItemBinding
import com.celtic.furniplan.model.Banner

class HomeAdapter(private val data: List<Banner>) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {
    class ViewHolder(
        private val binding: BannerItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(banner: Banner) = with(binding) {
            bannerImageView.setImageResource(banner.imageEvent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = BannerItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }
}

