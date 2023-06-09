package com.celtic.furniplan.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.celtic.furniplan.databinding.FragmentHomeBinding
import com.celtic.furniplan.model.Banners.getBannerData
import com.celtic.furniplan.model.Produks
import com.celtic.furniplan.model.Produks.getProdukData

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        pemanggilan RV banner
        with(binding.bannerRecyclerView) {
            adapter = BannerAdapter(getBannerData())
            setHasFixedSize(true)
        }

//        pemanggilan RV produk best seller
        with(binding.bestSellerRecyclerView) {
            adapter = CardProdukAdapter(getProdukData())
            setHasFixedSize(true)
        }
    }
}