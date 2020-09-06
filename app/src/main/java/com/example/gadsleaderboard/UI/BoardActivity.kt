package com.example.gadsleaderboard.UI

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.gadsleaderboard.R

class BoardActivity: AppCompatActivity() {

    val viewPager by lazy {
        findViewByID<ViewPager2?>(R.id.view_pager)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_board)


        initViewPager()

    }

    private fun initViewPager() {
        viewPager.adapter = BroadViewPagerAdapter()
    }
}

