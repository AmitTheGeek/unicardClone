package com.example.unicard.adapter

import android.app.Activity
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.SimpleTarget
import com.example.unicard.R
import com.example.unicard.databinding.LayoutDashboardFragBinding


class DashboardViewPagerAdapter(
    val activity: Activity,
    val list: List<Int>
): PagerAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(activity)
        val binding: LayoutDashboardFragBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.layout_dashboard_frag, container, false
        )
        /*Glide.with(activity)
            .load(list[position])
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .dontAnimate()
            .into(binding.image)*/
        binding.image.setImageResource(list[position])
        container.addView(binding.root)
        return binding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        return container.removeViewAt(position)
    }
}