package com.celtic.furniplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.celtic.furniplan.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    private val splashTimeOut: Long = 2000 // Durasi tampilan splash screen dalam milidetik (misalnya 3 detik)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Menggunakan Handler untuk menjalankan kode setelah durasi splashTimeOut
        Handler().postDelayed({
            // Setelah splash screen selesai, pindah ke activity selanjutnya (misalnya MainActivity)
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Selesaikan activity splash sehingga tidak dapat dikembalikan dengan tombol back
        }, splashTimeOut)


    }
}