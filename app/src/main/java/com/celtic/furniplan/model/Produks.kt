package com.celtic.furniplan.model

import com.celtic.furniplan.R

object Produks {
    fun getProdukData(): List<Produk> {
        return listOf(
            Produk(R.drawable.image_kasur, "Kasur Big Size", "Rp 3.200.000", "Kasur ini memiliki tingkat kekerasan medium, cocok digunakan oleh orang dewasa.\n" +
                    "Spesifikasi\n" +
                    "• High quality bonnell spring\n" +
                    "• High density foam\n" +
                    "• Lapisan cover dengan kain quilting supersoft, yang lembut dan tidak panas\n" +
                    "• Ketebalan: 21 cm\n" +
                    "• Garansi 10 tahun (syarat dan ketentuan berlaku)" ),
            Produk(R.drawable.image_sofa, "Sofa Minimalis", "Rp 2.500.000", "Sofa estetik, cocok digunakan oleh orang dewasa.\n" +
                    "Spesifikasi\n" +
                    "• High density foam\n" +
                    "• Lapisan cover dengan kain quilting supersoft, yang lembut dan tidak panas\n" +
                    "• Garansi 10 tahun (syarat dan ketentuan berlaku)"),
            Produk(R.drawable.image_meja, "Meja Ruang Tamu", "Rp 3.000.000", "Meja Ruang Tamu, dengan desain minimalis dan bahan yang kokoh.\n" +
                    "Spesifikasi\n" +
                    "• High quality wood\n" +
                    "• Kayu dilapisi dengan cat anti rayap kuat 100 tahun\n" +
                    "• Garansi 10 tahun (syarat dan ketentuan berlaku)")
        )
    }
}