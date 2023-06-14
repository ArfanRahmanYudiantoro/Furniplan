package com.celtic.furniplan.ui.detil_produk

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.celtic.furniplan.databinding.FragmentDetailSofaBinding

class SofaFragment: Fragment() {

    private lateinit var binding: FragmentDetailSofaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailSofaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}