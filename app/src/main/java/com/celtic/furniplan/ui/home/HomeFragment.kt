package com.celtic.furniplan.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.celtic.furniplan.databinding.FragmentHomeBinding
import com.celtic.furniplan.model.Banners.getBannerData

class HomeFragment: Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding.bannerRecyclerView){
            addItemDecoration(DividerItemDecoration(context, RecyclerView.HORIZONTAL))
            adapter = HomeAdapter(getBannerData())
            setHasFixedSize(true)
        }
    }
}