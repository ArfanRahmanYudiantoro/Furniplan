package com.celtic.furniplan.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.celtic.furniplan.R
import com.celtic.furniplan.databinding.FragmentHomeBinding
import com.celtic.furniplan.model.Banners.getBannerData
import com.celtic.furniplan.model.Produks
import com.celtic.furniplan.model.Produks.getProdukData
import com.celtic.furniplan.ui.detil_produk.KasurFragment

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

        binding.cardViewKasur.setOnClickListener {
            findNavController().navigate(
                R.id.kasurFragment
            )
        }

        binding.cardViewMeja.setOnClickListener {
            findNavController().navigate(
                R.id.mejaFragment
            )
        }

        binding.cardViewSofa.setOnClickListener {
            findNavController().navigate(
                R.id.sofaFragment
            )
        }
    }
}