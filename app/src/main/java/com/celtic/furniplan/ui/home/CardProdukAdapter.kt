package com.celtic.furniplan.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.celtic.furniplan.databinding.CardProdukItemBinding
import com.celtic.furniplan.model.Produk

class CardProdukAdapter(private val data: List<Produk>) :
    RecyclerView.Adapter<CardProdukAdapter.ViewHolder>() {

    class ViewHolder(private val binding: CardProdukItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(produk: Produk) = with(binding) {
            imageViewFotoProduk.setImageResource(produk.imageProduk)
            textViewNamaProduk.text = produk.namaProduk
            textViewHargaProduk.text = produk.hargaProduk
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CardProdukItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }
}