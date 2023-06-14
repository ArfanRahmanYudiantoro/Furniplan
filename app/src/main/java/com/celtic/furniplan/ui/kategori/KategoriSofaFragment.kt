package com.celtic.furniplan.ui.kategori

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.celtic.furniplan.R
import com.celtic.furniplan.databinding.FragmentKategoriMejaBinding
import com.celtic.furniplan.databinding.FragmentKategoriSofaBinding

class KategoriSofaFragment: Fragment() {
    private lateinit var binding: FragmentKategoriSofaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKategoriSofaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.cvMejaRuangTamu.setOnClickListener {
            findNavController().navigate(
                R.id.sofaFragment
            )
        }
    }
}