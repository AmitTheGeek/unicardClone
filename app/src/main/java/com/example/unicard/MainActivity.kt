package com.example.unicard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.unicard.adapter.DashboardViewPagerAdapter
import com.example.unicard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var _binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        _binding.tabDots.setupWithViewPager(_binding.viewPager)
        _binding.viewPager.adapter = DashboardViewPagerAdapter(
            this,
            /*listOf(
                "https://play-lh.googleusercontent.com/CZS4yW0JR2vQqem_J6Ia-DBITjiwB77ivJrSPVWxeXTOYDoqb5aVEg745KqYpnJV8EU=w526-h296-rw",
                "https://play-lh.googleusercontent.com/-ld15WWPqYVS1hycs1wx2gc8sXUKuq5Po5HhN_GVruWKeSu_qxt7_58AGGyTaDGo5w=w2560-h1440-rw",
                "https://play-lh.googleusercontent.com/m_BluVmIjjJGqxGf0t7iR-13Wo-b6c2C6Zc-v6dteq_DWwnGRmZrVixnDsvzwI82Z6M=w2560-h1440-rw",
                "https://play-lh.googleusercontent.com/WvbFzy4AyqMpwzdQ0-NMvoJYL2zTpGzKlOBijDvsltj3FgeUf6f41nu3cUcV2zM62Q=w2560-h1440-rw",
                "https://play-lh.googleusercontent.com/zVC8u4y8qkhn3rCumPy3255eD8CreYx2zkhzYl8NjiALhHmap-MsrnmM_iDz5jLKNA=w2560-h1440-rw"
            )*/
        listOf(
            R.drawable.first,
            R.drawable.second,
            R.drawable.third,
            R.drawable.fourth,
            R.drawable.fifth
        )
        )
    }
}