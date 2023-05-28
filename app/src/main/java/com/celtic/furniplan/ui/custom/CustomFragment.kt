package com.celtic.furniplan.ui.custom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.celtic.furniplan.databinding.FragmentCustomBinding

class CustomFragment: Fragment(){
    private lateinit var binding: FragmentCustomBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCustomBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}