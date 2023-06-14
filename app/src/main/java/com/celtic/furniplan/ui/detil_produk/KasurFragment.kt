package com.celtic.furniplan.ui.detil_produk

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.celtic.furniplan.databinding.FragmentDetailKasurBinding

class KasurFragment: Fragment() {

    private lateinit var binding: FragmentDetailKasurBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailKasurBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}