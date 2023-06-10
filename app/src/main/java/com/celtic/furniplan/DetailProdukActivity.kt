package com.celtic.furniplan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.celtic.furniplan.databinding.ActivityDetailProdukBinding

class DetailProdukActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailProdukBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailProdukBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}