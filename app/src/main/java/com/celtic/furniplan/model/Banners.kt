package com.celtic.furniplan.model

import com.celtic.furniplan.R

object Banners {
    fun getBannerData(): ArrayList<Banner> {
        val bannerList = ArrayList<Banner>()
        val banner1 = Banner(R.drawable.banner_gratis_ongkir)
        bannerList.add(banner1)
        val banner2 = Banner(R.drawable.banner_kemerdekaan)
        bannerList.add(banner2)

        return bannerList
    }
}