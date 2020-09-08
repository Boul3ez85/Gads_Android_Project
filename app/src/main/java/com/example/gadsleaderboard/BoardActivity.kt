package com.example.gadsleaderboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.gadsleaderboard.R
import com.example.gadsleaderboard.adapters.BroadViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_board.*

class BoardActivity: AppCompatActivity() {

    val viewPager by lazy {
        findViewById<ViewPager2>(R.id.view_pager)
    }

    val tabs by lazy {
        findViewById<TabLayout>(R.id.tabs)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_board)


        initViewPager()

    }

    private fun initViewPager() {
        viewPager.adapter = BroadViewPagerAdapter(this)

        TabLayoutMediator(tabs, viewPager) { tab, pos->
            tab.text = TABS[pos]
        }.attach()
    }
}

