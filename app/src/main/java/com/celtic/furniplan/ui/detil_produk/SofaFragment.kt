package com.celtic.furniplan.ui.detil_produk

import android.content.Intent
import android.net.Uri
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnHubungi.setOnClickListener {
            val phoneNumber = "+6285172243744"
            chatWhatsApp(phoneNumber)
        }
    }

    fun chatWhatsApp(number: String) {
        val phoneNumber = number.replace("+", "").replace(" ", "")
        val url = "https://api.whatsapp.com/send?phone=$phoneNumber"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
}